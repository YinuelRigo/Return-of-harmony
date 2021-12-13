import greenfoot.*;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Score extends World
{
    
    public Score()
    {    
        super(600, 400, 1);
        prepareScore();
    }
    
    private void prepareScore(){
        addObject(new SingboardGameTittle(),311,57);
        addObject(new SingboardScore(),300,121);
    }
    
    public void act(){
        showScore(); 
        closeGame();
    }
    
    public void showScore(){
        int y = 150;
        String nameAndScore;
        
        try{
            File file = new File("RecordFile.txt");    
            Scanner entry = new Scanner(new FileReader(file));
    
            do{
                nameAndScore = entry.next();
                GreenfootImage showText = getBackground();
                Font adjustedFont = new Font(null,true, false, 30);
                
                
                showText.setColor(Color.BLACK);
                showText.setFont(adjustedFont);
                showText.drawString(nameAndScore, 200, y+=40);
            }while(entry.hasNext());
        }catch(IOException e){
          
        }   
    }
    
    public void closeGame(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.stop();
        }
    }
}
