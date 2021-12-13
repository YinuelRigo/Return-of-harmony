import greenfoot.*;

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
        GreenfootImage showText = getBackground();
        Font adjustedFont = new Font(null,true, false, 22);
                
        showText.setColor(Color.BLACK);
        showText.setFont(adjustedFont);
        showText.drawString("Created by Yinuel Rigoberto Garcia Hernandez", 70, 250);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("ESCAPE")){
            Greenfoot.setWorld(new Menu());
        }
    }
}
