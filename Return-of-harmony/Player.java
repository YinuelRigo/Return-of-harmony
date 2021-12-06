import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Actor
{
    private static final int speed = 3;
    private int vSpeed = 0;
    
    private boolean jumping;
    private static final int jumpHeight = -15;
    
    private int direction = 1;
    
    private int health = 4;
    
    private static final int shootingCount = 20;
    private int shootingTimer;
    
    private String []images;
    private int frame = 0;
    
    Level thisGame;
    
    public void act()
    {
        handleKeys();
        checkFalling();
        pickUpItems();
        fall();
        
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
       
       if(Greenfoot.isKeyDown("right")){
           direction = 1;
           setLocation(x + speed,y);  
           animationRight();
       }
       
       if(Greenfoot.isKeyDown("left")){
           direction =  -1;
           setLocation(x - speed,y);
           animationLeft();
       }
       
       if(Greenfoot.isKeyDown("Z") && jumping == false){
           vSpeed = jumpHeight; 
           jumping = true;
           animationJump();
           fall();
       }
       
       if(Greenfoot.isKeyDown("X") && direction == 1 && shootingTimer <= 0){
           shootingTimer = shootingCount;
           PleyerProyectileR playerProyectileR = new PleyerProyectileR();
           getWorld().addObject(playerProyectileR, getX() + 27, getY() - 22);
       }else if(Greenfoot.isKeyDown("X") && direction == -1 && shootingTimer <= 0){
           shootingTimer = shootingCount;
           PlayerProyectileL playerProyectileL = new PlayerProyectileL();
           getWorld().addObject(playerProyectileL, getX() - 27, getY() - 22); 
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
            
            if(frame == 0){
                setImage(images[0]);    
            }
            if(frame == 5){
                setImage(images[1]);    
            }
            if(frame == 10){
                setImage(images[2]);    
            }
            if(frame == 15){
                setImage(images[3]);    
            }
            if(frame == 20){
                setImage(images[4]);    
            }
            if(frame == 25){
                setImage(images[5]);
                frame = 0;
                return;
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
            
            if(frame == 0){
                setImage(images[0]);    
            }
            if(frame == 5){
                setImage(images[1]);    
            }
            if(frame == 10){
                setImage(images[2]);    
            }
            if(frame == 15){
                setImage(images[3]);    
            }
            if(frame == 20){
                setImage(images[4]);    
            }
            if(frame == 25){
                setImage(images[5]);
                frame = 0;
                return;
            }
        
            frame ++;
        }
    } 
    
    public void pickUpItems(){
        Actor item = getOneIntersectingObject(Items.class);
        Actor gem = getOneIntersectingObject(IGem.class);
        Actor heart = getOneIntersectingObject(ILife.class);
        Actor element = getOneIntersectingObject(IElement.class);
        
        if(item != null){
            getWorld().removeObject(item);
        }
        if(gem != null){
            thisGame.score+=100;
        }
        if(heart != null){
            
        }
        if(element != null){
            switch(thisGame.currentLevel){
                case 0:
                    Greenfoot.setWorld(new Level1());
                    break;
                case 1:
                    Greenfoot.setWorld(new Level2());
                    break;
                case 2:
                    Greenfoot.setWorld(new Level3());
                    break;
                case 3:
                    Greenfoot.setWorld(new Menu());
                    break;
            }
        }
    }
}
