import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyWalking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyWalking extends Enemy
{
    /**
     * Act - do whatever the EnemyWalking wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3;
    int count = 0;
    int health = 3;
    boolean hitProjectile = false;
    
    Level thisGame;
    
    public void act()
    {
        count++;
        moveAround();
        
        hitProjectile();
    }
    
    public void moveAround(){
        if(count < 60){
            setLocation(getX() + speed, getY());
        }else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
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
