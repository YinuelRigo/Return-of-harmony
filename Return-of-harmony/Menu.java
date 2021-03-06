import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private int option=0;
    
    private static final int MENU_COUNT = 20;
    private int menuTimer;
    
    private SingboardArrow arrow = new SingboardArrow();
    
    private GreenfootSound backgroundMusic = new GreenfootSound("SongMenu.mp3");

    public Menu()
    {    
        super(600, 400, 1); 
        music();
        prepareMenu();
    }

    private void prepareMenu(){
        addObject(new SingboardGameTittle(),311,57);
        addObject(new SingboardPlay(),500,200);
        addObject(new SingboardLevels(),500,250);
        addObject(new SingboardCredits(),500,300);
        addObject(arrow,420,200);
    }
    
    public void act(){
        handleKeys();
        closeGame();
    }
    
    public void music(){
        backgroundMusic.setVolume(60);
        backgroundMusic.play();
    }
    
    public void handleKeys(){
        int limitUp = 0, limitDown = 3;
        
        if (Greenfoot.isKeyDown("UP") && menuTimer <= 0) {
            menuTimer = MENU_COUNT;
            option--;
        }
        if (Greenfoot.isKeyDown("DOWN") && menuTimer <= 0) {
            menuTimer = MENU_COUNT;
            option++;
        }
        menuTimer --;
        
        if(option >= limitDown) option=0;
        if(option < limitUp) option=2;
        
        arrow.setLocation(420,200 + (option*50));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(option){
            case 0:
                Greenfoot.setWorld(new Tutorial());
                break;
            case 1:
                Greenfoot.setWorld(new LevelSelect());
                break;
            case 2:
                Greenfoot.setWorld(new Credits());
                break;
            }
            backgroundMusic.stop();
        }
    }
    
    public void closeGame(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.stop();
        }
    }
}
