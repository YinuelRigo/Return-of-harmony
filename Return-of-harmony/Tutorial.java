import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Level
{
    Level thisGame;
    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {
        prepare();
        thisGame.score = 0;
        thisGame.currentLevel = 0;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GroundLvT groundLvT = new GroundLvT();
        addObject(groundLvT,9,391);
        GroundLvT groundLvT2 = new GroundLvT();
        addObject(groundLvT2,105,391);
        GroundLvT groundLvT3 = new GroundLvT();
        addObject(groundLvT3,201,391);
        GroundLvT groundLvT4 = new GroundLvT();
        addObject(groundLvT4,297,391);
        GroundLvT groundLvT5 = new GroundLvT();
        addObject(groundLvT5,393,391);
        GroundLvT groundLvT6 = new GroundLvT();
        addObject(groundLvT6,489,391);
        GroundLvT groundLvT7 = new GroundLvT();
        addObject(groundLvT7,585,391);

        SingboardTutorial1 tTutorial1 = new SingboardTutorial1();
        addObject(tTutorial1,100,130);
        SingboardTutorial2 tTutorial2 = new SingboardTutorial2();
        addObject(tTutorial2,300,120);
        SingboardTutorial3 tTutorial3 = new SingboardTutorial3();
        addObject(tTutorial3,500,130);
        
        Player player = new Player();
        addObject(player,32,317);
        
        IElement iElement = new IElement();
        addObject(iElement,558,290);
    }
}
