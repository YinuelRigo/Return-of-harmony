import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyProyectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyProjectile extends Projectile
{
    private static final int SPEED = 5;
    
    public void act()
    {
        move(-SPEED);
        removeProjectile();
    }
}
