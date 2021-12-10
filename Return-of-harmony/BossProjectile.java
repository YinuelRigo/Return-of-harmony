import greenfoot.*; 

public class BossProjectile extends Projectile
{
    private static final int SPEED = 5;
    
    public void act()
    {
        move(-SPEED);
        removeProjectile();
    }
}
