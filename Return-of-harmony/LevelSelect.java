import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        PrepareLevels();
    }

    private void PrepareLevels(){
        addObject(new BGameTittle(),311,57);
        addObject(new BLevels(),300,121);
    }

    public void act(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
