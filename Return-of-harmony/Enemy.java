import greenfoot.*;

public class Enemy extends Actor
{
    private int health = 3;

    public void act(){
        hitProjectile();
    }
    
    public void hitProjectile(){
        Actor playerProjectile = getOneIntersectingObject(PlayerProjectile.class);
        
        if(playerProjectile != null){
            health --;
            getWorld().removeObject(playerProjectile);
        }
        
        if(health <= 0){
            getWorld().removeObject(this);
        }
    }
}
