import greenfoot.*; 

public class Level extends World implements ScoreManager
{
    public int level = 1;
    
    public Level()
    {    
        super(600, 400, 1); 
        updateScore(0);
    }
    
    public void act(){
        closeGame();
    }
    
    public void closeGame(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.stop();
        }
    }
    
    public void updateScore(int score){
        showText("Score: " + score,500,25);
    }
}
