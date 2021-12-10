import greenfoot.*;

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
