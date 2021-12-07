import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Credits extends World
{
    public Credits()
    {    
        super(600, 400, 1);
        prepareCredits();
    }
    
    private void prepareCredits(){
        addObject(new SingboardGameTittle(),311,57);
        addObject(new SingboardCredits(),300,121);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
