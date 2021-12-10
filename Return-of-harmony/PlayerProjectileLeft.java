import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerProyectileL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerProjectileLeft extends PlayerProjectile
{
    private static final int SPEED = 10;
    
    /**
     * Act - do whatever the PlayerProyectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-SPEED);
        removeProjectile();
    }
}
