import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    Level thisGame;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        prepare();
        thisGame.currentLevel = 2;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GroundLv2 groundLv2g1 = new GroundLv2();
        addObject(groundLv2g1,9,391);
        GroundLv2 groundLv2g2 = new GroundLv2();
        addObject(groundLv2g2,105,391);
        GroundLv2 groundLv2g3 = new GroundLv2();
        addObject(groundLv2g3,201,391);
        GroundLv2 groundLv2g4 = new GroundLv2();
        addObject(groundLv2g4,297,391);
        GroundLv2 groundLv2g5 = new GroundLv2();
        addObject(groundLv2g5,393,391);
        GroundLv2 groundLv2g6 = new GroundLv2();
        addObject(groundLv2g6,489,391);
        GroundLv2 groundLv2g7 = new GroundLv2();
        addObject(groundLv2g7,585,391);
        
        Player player = new Player();
        addObject(player,45,133);
        
        IElement iElement = new IElement();
        addObject(iElement,557,313);
    }
}
