import greenfoot.*;

public class Level1 extends Level
{
    
    public Level1()
    {    
        prepare();
        showText("Level: " + 1,300,25);
    }
    
    private void prepare()
    {
        addObject(new GroundLevelOne(),9,391);
        addObject(new GroundLevelOne(),105,391);
        addObject(new GroundLevelOne(),201,391);
        addObject(new GroundLevelOne(),297,391);
        addObject(new GroundLevelOne(),393,391);
        addObject(new GroundLevelOne(),489,391);
        addObject(new GroundLevelOne(),585,391);

        addObject(new Player(this),45,133);
        
        addObject(new EnemyWalking(),520,323);
    
        addObject(new ItemElementBronze(),557,313);
        
        addObject(new ItemGem(),200,313);
        addObject(new ItemGem(),250,313);
        addObject(new ItemGem(),300,313);
    }
}
