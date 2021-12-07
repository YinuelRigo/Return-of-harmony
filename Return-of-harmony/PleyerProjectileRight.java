import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PleyerProyectileR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PleyerProjectileRight extends PlayerProjectile
{
    private static final int speed = 10;
    
    /**
     * Act - do whatever the PlayerProyectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        removeProjectile();
    }
}
