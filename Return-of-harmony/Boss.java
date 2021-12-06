import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    int health = 50;
    boolean hitProjectile = false;
    
    Level thisGame;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        hitProjectile();
    }
    
    public void hitProjectile(){
        Actor playerProyectile = getOneIntersectingObject(PlayerProyectile.class);
        
        if(playerProyectile != null && !hitProjectile){
            health --;
            hitProjectile = true;
            getWorld().removeObject(playerProyectile);
        }else if(!isTouching(PlayerProyectile.class)){
            hitProjectile = false;
        }
        
        if(health <= 0){
            getWorld().removeObject(this);
            thisGame.score+=100;
        }
    }
}