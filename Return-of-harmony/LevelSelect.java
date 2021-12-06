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
    SingboardArrow arrow = new SingboardArrow();
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepareLevels();
    }

    private void prepareLevels(){
        addObject(new SingboardGameTittle(),311,57);
        addObject(new SingboardLevels(),300,121);
        
        addObject(arrow,420,200);
    }

    public void act(){
        if (Greenfoot.isKeyDown("LELF")) {option--;}
        if (Greenfoot.isKeyDown("RIGHT")) {option++;}
        
        if(option>=3) option=0;
        if(option<0) option=2;
        
        arrow.setLocation(420,200 + (option*50));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(option){
            case 0: //lEVEL1
                Greenfoot.setWorld(new Level1());
                break;
            case 1: //LEVEL2
                Greenfoot.setWorld(new Level2());
                break;
            case 2: //LEVEL3
                Greenfoot.setWorld(new Level3());
                break;
            }
        }
        
        
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
