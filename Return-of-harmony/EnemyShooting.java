import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShooting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShooting extends Enemy
{
    private String []images;
    private int frame = 0;
    
    private static final int PROJECTILE_RELOADING = 90;
    private int shootingTimer;

    
    public void act()
    {
        animationShot();
        shooting();
        hitProjectile();
        
        shootingTimer --;
    }
    
    public void animationShot(){
        images = new String[]{
            "images/CH_IdleAttack_3.png",
            "images/CH_IdleAttack_1.png",
            "images/CH_IdleAttack_2.png"
        };
        
        setImage(images[frame/45]);
            
        if(frame == 90){
             frame=0;
        }
    
        frame ++;
    }
    
    public void shooting(){
        if(shootingTimer <= 0){
           shootingTimer = PROJECTILE_RELOADING;
           getWorld().addObject(new EnemyProjectile(), getX() - 27, getY() - 22); 
       }
    }  
}
