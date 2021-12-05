import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private static final int OFFSET = 3;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
       int y = getY();
        
       if(Greenfoot.isKeyDown("right")){
           setLocation(x + OFFSET,y);       
       }
       
       if(Greenfoot.isKeyDown("left")){
           setLocation(x - OFFSET,y);
       }
       
       if(Greenfoot.isKeyDown("Z")){
           
       }
       
       if(Greenfoot.isKeyDown("X")){
           
       }
    }
}
