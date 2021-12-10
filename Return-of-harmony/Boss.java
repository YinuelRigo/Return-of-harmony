import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boss extends Enemy
{
    private int health = 20;
    
    GifImage BossGif = new GifImage("KS_idle.gif");
    
    private static final int PROJECTILE_RELOADING = 90;
    private int shootingTimer;
    private int shootingTimer2 = 45;
    public void act()
    {
        setImage(BossGif.getCurrentImage());
        hitProjectile();
        shooting();
        
        shootingTimer --;
        shootingTimer2 --;
    }
    
    public void hitProjectile(){
        Actor playerProyectile = getOneIntersectingObject(PlayerProjectile.class);
        
        if(playerProyectile != null){
            health --;
            getWorld().removeObject(playerProyectile);
        }
        
        if(health <= 0){
            getWorld().removeObject(this);
        }
    }
    
    public void shooting(){
       if(shootingTimer <= 0){
           shootingTimer = PROJECTILE_RELOADING;
           
           getWorld().addObject(new BossProjectile(), getX() - 56, getY() - 39);  
       }
       
       if(shootingTimer2 <= 0){
           shootingTimer2 = PROJECTILE_RELOADING;
           
           getWorld().addObject(new BossProjectile(), getX() - 56, getY() + 29); 
       }
    } 
}
