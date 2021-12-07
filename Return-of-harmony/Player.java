import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Actor
{
    private static final int SPEED = 3;
    private int vSpeed = 0;
    
    private boolean jumping;
    private static final int JUMP_HEIGHT = -15; 
    
    private int direction = 1;
    
    private boolean drawHearths = true;
    private int health = 3;
    private static final int INVULNERABILITY = 50;
    private int healthTimer;
    
    private static final int PROJECTILE_RELOADING = 20;
    private int shootingTimer;
    
    private String []images;
    private int frame = 0;
    
    private int score = 0;
    private ScoreManager scoreManager;  
    
    Player(ScoreManager scoreManager){
        this.scoreManager = scoreManager; 
    }
    
    public void act()
    {
        handleKeys();
        checkFalling();
        pickUpItems();
        loseHealth();
        fall();
        playerLife();
        
        healthTimer--;
        shootingTimer --;
    }
    
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
    }
    
    public void checkFalling(){
        
        if(!isTouching(Ground.class)){
            vSpeed++;
        }else {                        
            vSpeed = 0;
            jumping = false;
            checkStanding();
        }
    }
    
    public void checkStanding(){
        if(!Greenfoot.isKeyDown("right") && direction == 1)
            {
                setImage("images/TS_IdleR.png");
            }
        if(!Greenfoot.isKeyDown("left") && direction == -1)
            {
                setImage("images/TS_IdleL.png");
            }
    }
    
    private void handleKeys(){
       int x = getX();
       int y = getY();
       
       if(Greenfoot.isKeyDown("right") && getOneObjectAtOffset(SPEED + 10, 0, Ground.class) == null){
           direction = 1;
           setLocation(x + SPEED,y);  
           animationRight();
       }
       
       if(Greenfoot.isKeyDown("left") && getOneObjectAtOffset(-SPEED - 10, 0, Ground.class) == null){
           direction =  -1;
           setLocation(x - SPEED,y);
           animationLeft();
       }
       
       if(Greenfoot.isKeyDown("Z") && jumping == false && getOneObjectAtOffset(0, SPEED, Ground.class) == null){
           vSpeed = JUMP_HEIGHT; 
           jumping = true;
           animationJump();
           fall();
       }
       
       if(Greenfoot.isKeyDown("X") && direction == 1 && shootingTimer <= 0){
           shootingTimer = PROJECTILE_RELOADING;
           PleyerProjectileRight playerProjectileRight = new PleyerProjectileRight();
           getWorld().addObject(playerProjectileRight, getX() + 27, getY() - 22);
       }else if(Greenfoot.isKeyDown("X") && direction == -1 && shootingTimer <= 0){
           shootingTimer = PROJECTILE_RELOADING;
           PlayerProjectileLeft playerProjectileLeft = new PlayerProjectileLeft();
           getWorld().addObject(playerProjectileLeft, getX() - 27, getY() - 22); 
       }
    }
    
    public void animationJump(){
        if(jumping == true && direction == 1){
            setImage("images/TS_JumpR.png");
        }else if(jumping == true && direction == -1){
            setImage("images/TS_JumpL.png");
        }
    }
    
    public void animationRight(){
        images = new String[]{
            "images/TS_WalkR_1.png",
            "images/TS_WalkR_2.png",
            "images/TS_WalkR_3.png",
            "images/TS_WalkR_4.png",
            "images/TS_WalkR_5.png",
            "images/TS_WalkR_6.png"
        };
        
        if(jumping == false){
            setImage(images[frame/5]);
            
            if(frame == 25){
                frame=0;
            }
    
            frame ++;
        }
    }
    
    public void animationLeft(){
        images = new String[]{
            "images/TS_WalkL_1.png",
            "images/TS_WalkL_2.png",
            "images/TS_WalkL_3.png",
            "images/TS_WalkL_4.png",
            "images/TS_WalkL_5.png",
            "images/TS_WalkL_6.png"
        };
        
        if(jumping == false){
            setImage(images[frame/5]);
            
            if(frame == 25){
                frame=0;
            }
    
            frame ++;
        }
    } 

    
    public void pickUpItems(){        
        Actor item = getOneIntersectingObject(Item.class);
        Actor gem = getOneIntersectingObject(ItemGem.class);
        Actor heart = getOneIntersectingObject(ItemLife.class);
        Actor element = getOneIntersectingObject(ItemElement.class);
        Actor elementBronze = getOneIntersectingObject(ItemElementBronze.class);
        Actor elementSilver = getOneIntersectingObject(ItemElementSilver.class);
        Actor elementGold = getOneIntersectingObject(ItemElementGold.class);
        
        if(item != null){
            getWorld().removeObject(item);
        }
        if(gem != null){
            score += 100;
            World world =  getWorld();
            scoreManager.updateScore(score);
        }
        if(heart != null){
            health ++;
        }
        if(element != null){
            Greenfoot.setWorld(new Level1());
        }
        if(elementBronze != null){
            Greenfoot.setWorld(new Level2());
        }
        if(elementSilver != null){
            Greenfoot.setWorld(new Level3());
        }
        if(elementGold != null){
            Greenfoot.setWorld(new Menu());
        }
    }
    
    public void loseHealth(){
        Actor enemy = getOneIntersectingObject(Enemy.class);
        
        if(enemy != null && healthTimer <= 0){
            healthTimer = INVULNERABILITY;
            health --;
            
            getWorld().removeObjects(getWorld().getObjects(Health.class));
            drawHearths = true;
        }
        
        if(health == 0){
            Greenfoot.setWorld(new Menu());
        }
        
    }
    
    public void playerLife(){
        if(health == 1 && drawHearths == true){   
            getWorld().addObject(new Health(), 21, 21);
        } else if(health == 2 && drawHearths == true){   
            getWorld().addObject(new Health(), 21, 21);
            getWorld().addObject(new Health(), 51, 21);
        }else if(health == 3 && drawHearths == true){   
            getWorld().addObject(new Health(), 21, 21);
            getWorld().addObject(new Health(), 51, 21);
            getWorld().addObject(new Health(), 81, 21);
        } else if(health == 4 && drawHearths == true){   
            getWorld().addObject(new Health(), 21, 21);
            getWorld().addObject(new Health(), 51, 21);
            getWorld().addObject(new Health(), 81, 21);
            getWorld().addObject(new Health(), 111, 21);
        }else if(health == 5 && drawHearths == true){   
            getWorld().addObject(new Health(), 21, 21);
            getWorld().addObject(new Health(), 51, 21);
            getWorld().addObject(new Health(), 81, 21);
            getWorld().addObject(new Health(), 111, 21);
            getWorld().addObject(new Health(), 141, 21);
        }else if(health <=6 && drawHearths == true){
            health = 5; 
        }
        drawHearths = false;
    }
    
}
