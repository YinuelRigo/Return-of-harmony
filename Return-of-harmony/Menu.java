import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    BArrow arrow = new BArrow();
    private int option=0;
    
    public Menu()
    {    
        super(600, 400, 1); 
        PrepareMenu();
    }

    private void PrepareMenu(){
        addObject(new BGameTittle(),311,57);
        addObject(new BPlay(),500,200);
        addObject(new BLevels(),500,250);
        addObject(new BCredits(),500,300);
        addObject(arrow,420,200);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP")) {option--;}
        if (Greenfoot.isKeyDown("DOWN")) {option++;}
        
        if(option>=3) option=0;
        if(option<0) option=2;
        
        arrow.setLocation(420,200 + (option*50));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(option){
                
            case 0: //Play
                Greenfoot.setWorld(new Level1());
                break;
            case 1: //Levels
                Greenfoot.setWorld(new LevelSelect());
                break;
            case 2: //Credits
                Greenfoot.setWorld(new Credits());
                break;
            }
        }
        
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.stop();
        }
    }
}
