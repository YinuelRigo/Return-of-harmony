import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    
    public Level3()
    {    
        prepare();
    }
    
    private void prepare()
    {
        addObject(new GroundLevelThree(),9,391);
        addObject(new GroundLevelThree(),105,391);
        addObject(new GroundLevelThree(),201,391);
        addObject(new GroundLevelThree(),297,391);
        addObject(new GroundLevelThree(),393,391);
        addObject(new GroundLevelThree(),489,391);
        addObject(new GroundLevelThree(),585,391);

        addObject(new Player(this),45,133);

        addObject(new ItemElementGold(),557,313);

        addObject(new Boss(),560,284);

        addObject(new ItemLife(),45,203);
        addObject(new ItemLife(),45,183);
        addObject(new ItemGem(),46,142);
    }
}
