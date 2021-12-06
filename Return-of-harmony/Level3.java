import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    Level thisGame;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        prepare();
        thisGame.currentLevel = 3;
    }
    
    private void prepare()
    {
        GroundLv3 groundLv3g1 = new GroundLv3();
        addObject(groundLv3g1,9,391);
        GroundLv3 groundLv3g2 = new GroundLv3();
        addObject(groundLv3g2,105,391);
        GroundLv3 groundLv3g3 = new GroundLv3();
        addObject(groundLv3g3,201,391);
        GroundLv3 groundLv3g4 = new GroundLv3();
        addObject(groundLv3g4,297,391);
        GroundLv3 groundLv3g5 = new GroundLv3();
        addObject(groundLv3g5,393,391);
        GroundLv3 groundLv3g6 = new GroundLv3();
        addObject(groundLv3g6,489,391);
        GroundLv3 groundLv3g7 = new GroundLv3();
        addObject(groundLv3g7,585,391);
        
        Player player = new Player();
        addObject(player,45,133);
        
        IElement iElement = new IElement();
        addObject(iElement,557,313);
    }
}
