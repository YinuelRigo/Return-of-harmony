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
    
    public void act()
    {
        animationShot();
    }
    
    public void animationShot(){
        images = new String[]{
            "images/CH_IdleAttack_1.png",
            "images/CH_IdleAttack_2.png",
            "images/CH_IdleAttack_3.png"
        };
        
        setImage(images[frame/15]);
            
        if(frame == 30){
             frame=0;
        }
    
        frame ++;
    }
}
