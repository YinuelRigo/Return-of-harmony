import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Credits extends World
{
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        PrepareCredits();
    }
    
    private void PrepareCredits(){
        addObject(new BGameTittle(),311,57);
        addObject(new BCredits(),300,121);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
