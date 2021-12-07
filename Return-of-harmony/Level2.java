import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    
    public Level2()
    {    
        prepare();
        showText("Level: " + 2,300,25);
    }
    
    private void prepare()
    {
        addObject(new GroundLevelTwo(),9,391);
        addObject(new GroundLevelTwo(),105,391);
        addObject(new GroundLevelTwo(),201,391);
        addObject(new GroundLevelTwo(),297,391);
        addObject(new GroundLevelTwo(),393,391);
        addObject(new GroundLevelTwo(),489,391);
        addObject(new GroundLevelTwo(),585,391);
        
        addObject(new Player(this),45,133);
        
        addObject(new ItemElementSilver(),557,313);
    }
}
