import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    private int option=0;

    private static final int MENU_COUNT = 20;
    private int menuTimer;

    SingboardArrowUp arrowUp = new SingboardArrowUp();

    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepareLevels();
    }

    private void prepareLevels(){
        addObject(new SingboardGameTittle(),311,57);
        addObject(new SingboardLevels(),300,121);

        addObject(arrowUp,115,350);
        
        addObject(new SingboardLevelSelectOne(), 100,250);
        addObject(new SingboardLevelSelectTwo(), 300,250);
        addObject(new SingboardLevelSelectThree(), 500,250);
    }

    public void act(){
        handleKeys();
        closeGame();
    }

    public void handleKeys(){
        int limitUp = 0, limitDown = 3;

        if (Greenfoot.isKeyDown("LEFT") && menuTimer <= 0) {
            menuTimer = MENU_COUNT;
            option--;
        }
        if (Greenfoot.isKeyDown("RIGHT") && menuTimer <= 0) {
            menuTimer = MENU_COUNT;
            option++;
        }
        menuTimer --;

        if(option >= limitDown) option=0;
        if(option < limitUp) option=2;

        arrowUp.setLocation(115 + (option*200),350);

        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(option){
                case 0:
                    Greenfoot.setWorld(new Level1());
                    break;
                case 1:
                    Greenfoot.setWorld(new Level2());
                    break;
                case 2:
                    Greenfoot.setWorld(new Level3());
                    break;
            }
        }
    }

    public void closeGame(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
