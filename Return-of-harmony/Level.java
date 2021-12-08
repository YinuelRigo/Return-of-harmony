import greenfoot.*; 

public class Level extends World implements ScoreManager
{ 
    private int totalScore;
    private int score;
    public Level()
    {    
        super(600, 400, 1); 
        updateScore(score);
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
        totalScore = score;
    }  
}
