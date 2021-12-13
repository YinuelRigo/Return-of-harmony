import greenfoot.*; 

public class BossProjectile extends Projectile
{
    private static final int SPEED = 10;
    
    private static final int PROJECTILE_RELOADING = 90;
    private int shootingTimer;
    
    private Player player;
    
    public BossProjectile(){
        getImage().scale(40,40);
    }
    
    public void act()
    {
        move(-SPEED);
        removeProjectile();
    }
}
