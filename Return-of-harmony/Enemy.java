import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int health = 3;
    private boolean hitProjectile = false;

    public void act(){
        hitProjectile();
    }
    
    public void hitProjectile(){
        Actor playerProjectile = getOneIntersectingObject(PlayerProjectile.class);
        
        if(playerProjectile != null && !hitProjectile){
            health --;
            hitProjectile = true;
            getWorld().removeObject(playerProjectile);
        }else if(!isTouching(PlayerProjectile.class)){
            hitProjectile = false;
        }
        
        if(health <= 0){
            getWorld().removeObject(this);
        }
    }
}
