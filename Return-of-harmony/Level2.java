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
        addObject(new GroundLevelTwo(),554,201);

        addObject(new GroundLevelTwo(),554,296);
        addObject(new GroundLevelTwo(),458,296);
        addObject(new GroundLevelTwo(),362,296);

        addObject(new GroundLevelTwo(),9,391);
        addObject(new GroundLevelTwo(),105,391);
        addObject(new GroundLevelTwo(),201,391);
        addObject(new GroundLevelTwo(),297,391);
        addObject(new GroundLevelTwo(),393,391);
        addObject(new GroundLevelTwo(),489,391);
        addObject(new GroundLevelTwo(),585,391);

        addObject(new Player(this),32,317);

        addObject(new ItemLife(),479,230);
        addObject(new ItemElementSilver(),576,73);

        addObject(new EnemyWalking(),288,322);
        addObject(new EnemyShooting(),481,227);
        addObject(new EnemyShooting(),582,131);
        addObject(new EnemyShootingFly(),579,73);
        addObject(new EnemyShootingFly(),480,163);
        
        addObject(new ItemGem(),537,129);
        addObject(new ItemGem(),537,99);
        addObject(new ItemGem(),439,219);
        addObject(new ItemGem(),409,219);
        addObject(new ItemGem(),379,219);
        addObject(new ItemGem(),349,219);
        addObject(new ItemGem(),439,189);
        addObject(new ItemGem(),409,189);
        addObject(new ItemGem(),379,189);
        addObject(new ItemGem(),349,189);
        addObject(new ItemGem(),264,269);
        addObject(new ItemGem(),234,269);
        addObject(new ItemGem(),204,269);
        addObject(new ItemGem(),174,269);
        addObject(new ItemGem(),144,269);
        addObject(new ItemGem(),114,269);
        addObject(new ItemGem(),264,299);
        addObject(new ItemGem(),234,299);
        addObject(new ItemGem(),204,299);
        addObject(new ItemGem(),174,299);
        addObject(new ItemGem(),144,299);
        addObject(new ItemGem(),114,299);
    }
}
