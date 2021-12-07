import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyWalking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyWalking extends Enemy
{ 
    private int speed = -3;
    private int count = 0;
    private int health = 3;
    private boolean hitProjectile = false;
    
    private int direction = 1;
    
    private String []images;
    private int frame = 0;
    
    public void act()
    {
        count++;
        moveAround();

        hitProjectile();
    }
    
    public void moveAround(){
        if(count <= 60){
            setLocation(getX() + speed, getY());
        }else{
            speed = -speed;
            direction = -direction;
            count = 0;
        }
        
        if(direction == 1){
            animationLeft();
        }else{
            animationRight();
        }
    }
    
    public void animationRight(){
        images = new String[]{
            "images/CH_Walk1R.png",
            "images/CH_Walk2R.png",
            "images/CH_Walk3R.png",
            "images/CH_Walk4R.png",
            "images/CH_Walk5R.png",
            "images/CH_Walk6R.png",
            "images/CH_Walk7R.png",
            "images/CH_Walk8R.png"
        };
        
        setImage(images[frame/5]);
            
        if(frame == 35){
             frame=0;
        }
    
        frame ++;
    }
    
    public void animationLeft(){
        images = new String[]{
            "images/CH_Walk1L.png",
            "images/CH_Walk2L.png",
            "images/CH_Walk3L.png",
            "images/CH_Walk4L.png",
            "images/CH_Walk5L.png",
            "images/CH_Walk6L.png",
            "images/CH_Walk7L.png",
            "images/CH_Walk8L.png"
        };
        
        setImage(images[frame/5]);
            
        if(frame == 35){
             frame=0;
        }
    
        frame ++;
    }
}
