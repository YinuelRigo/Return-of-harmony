import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    private int health = 20;
    private boolean hitProjectile = false;
    
    GifImage BossGif = new GifImage("KS_idle.gif");
    public void act()
    {
        setImage(BossGif.getCurrentImage());
        hitProjectile();
    }
    
    public void hitProjectile(){
        Actor playerProyectile = getOneIntersectingObject(PlayerProjectile.class);
        
        if(playerProyectile != null && !hitProjectile){
            health --;
            hitProjectile = true;
            getWorld().removeObject(playerProyectile);
        }else if(!isTouching(PlayerProjectile.class)){
            hitProjectile = false;
        }
        
        if(health <= 0){
            getWorld().removeObject(this);
        }
    }
}
