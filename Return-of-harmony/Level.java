import greenfoot.*; 

public class Level extends World implements ScoreManager
{ 
    private static int score;
    private GreenfootSound backgroundMusic = new GreenfootSound("SongLevels.mp3");
    private int ticks = 60;
    private int time = 60;
    
    public Level()
    {    
        super(600, 400, 1);
        updateScore(score);
    }
    
    public void act(){
        showText("Time: " + time,300,25);
        closeGame();
        
        time();
        ticks--;
    }    

    public void music(){
        backgroundMusic.setVolume(60);
        backgroundMusic.playLoop();
    }
    
    public void time(){
        
        if(ticks <= 0){
            time --;
            ticks = 60;
        }
        
        if(time == 0){
            Greenfoot.stop();
        }
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
