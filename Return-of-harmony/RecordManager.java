import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class RecordManager {

    private int maxSize;
    private String fileName;

    public RecordManager(int maxSize, String fileName)
    {
        this.maxSize=maxSize;
        this.fileName=fileName;
    }



    public void save(Record newRecord) {
        List<Record> records=getRecords();
        records.add(newRecord);
        
        records.sort(new Comparator<Record>(){
            @Override
            public int compare(Record o1, Record o2) {
                return o2.getScore() - o1.getScore();
            }
        });

        try (FileWriter fileWriter= new FileWriter(fileName);
             PrintWriter printWriter= new PrintWriter(fileWriter))
             {
                 int cont=0;
                 for(Record record : records){
                     printWriter.append(record.getPlayer()).append(",").print(record.getScore()+ "\n");
                     cont++;
                     if(cont==maxSize){
                         break;
                     }
               }

             } catch (IOException e) {
            e.printStackTrace();
            }
    }

    public List<Record> getRecords() {
        List<Record> records=new LinkedList<>();

        try (BufferedReader reader= new BufferedReader(new FileReader(fileName))){
            String currentLine;
            while((currentLine=reader.readLine())!=null){
                String []items=currentLine.split(",");
                records.add(new Record(items[0], Integer.parseInt(items[1])));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return records;
    }
}
