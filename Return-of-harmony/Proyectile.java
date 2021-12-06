import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerProyectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectile extends Actor
{
    private static final int speed = 10;
    
    /**
     * Act - do whatever the PlayerProyectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-speed);
        removeProyectile();
    }
    
    public void removeProyectile(){
        Actor walls = getOneIntersectingObject(Ground.class);
        
        if(getX() <= 1 || getX() >= getWorld().getWidth() -1){
            getWorld().removeObject(this);
        }else if(walls != null){
            getWorld().removeObject(this);
        }
            
    }
}
