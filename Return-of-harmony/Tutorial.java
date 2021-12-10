import greenfoot.*; 

public class Tutorial extends Level
{
    public Tutorial()
    {
        prepare();
        showText("Level: Tutorial",300,25);
    }
    
    private void prepare()
    {
        addObject(new GroundLevelTutorial(),207,325);
        addObject(new GroundLevelTutorial(),303,325);

        addObject(new GroundLevelTutorial(),9,391);
        addObject(new GroundLevelTutorial(),105,391);
        addObject(new GroundLevelTutorial(),201,391);
        addObject(new GroundLevelTutorial(),297,391);
        addObject(new GroundLevelTutorial(),393,391);
        addObject(new GroundLevelTutorial(),489,391);
        addObject(new GroundLevelTutorial(),585,391);

        addObject(new SingboardTutorial1(),100,130);
        addObject(new SingboardTutorial2(),300,120);
        addObject(new SingboardTutorial3(),500,130);

        addObject(new Player(this),32,317);

        addObject(new ItemElement(),558,290);

        addObject(new Enemy(),525,321);
        addObject(new Enemy(),337,254);
    }
}
