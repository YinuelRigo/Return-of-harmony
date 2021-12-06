import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    Level thisGame;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
        thisGame.score = 0;
        thisGame.currentLevel = 1;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GroundLv1 groundLv1g1 = new GroundLv1();
        addObject(groundLv1g1,9,391);
        GroundLv1 groundLv1g2 = new GroundLv1();
        addObject(groundLv1g2,105,391);
        GroundLv1 groundLv1g3 = new GroundLv1();
        addObject(groundLv1g3,201,391);
        GroundLv1 groundLv1g4 = new GroundLv1();
        addObject(groundLv1g4,297,391);
        GroundLv1 groundLv1g5 = new GroundLv1();
        addObject(groundLv1g5,393,391);
        GroundLv1 groundLv1g6 = new GroundLv1();
        addObject(groundLv1g6,489,391);
        GroundLv1 groundLv1g7 = new GroundLv1();
        addObject(groundLv1g7,585,391);

        Player player = new Player();
        addObject(player,45,133);
        EnemyWalking enemyWalking = new EnemyWalking();
        addObject(enemyWalking,472,323);
        IElement iElement = new IElement();
        addObject(iElement,557,313);
        IGem iGem = new IGem();
        addObject(iGem,204,313);
        IGem iGem2 = new IGem();
        addObject(iGem2,251,313);
        IGem iGem3 = new IGem();
        addObject(iGem3,297,314);
    }
}
