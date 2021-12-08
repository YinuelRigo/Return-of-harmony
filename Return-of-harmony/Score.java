import greenfoot.*;

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
}
