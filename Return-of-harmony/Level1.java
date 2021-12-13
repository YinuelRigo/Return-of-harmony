import greenfoot.*;

public class Level1 extends Level
{
    public Level1()
    {    
        prepare();
        music();
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

        addObject(new GroundLevelOne(),48,145);
        addObject(new GroundLevelOne(),144,145);
        addObject(new GroundLevelOne(),240,145);
        addObject(new GroundLevelOne(),336,145);
        addObject(new GroundLevelOne(),432,145);

        addObject(new Player(this),45,63);

        addObject(new EnemyWalking(),460,76);
        addObject(new EnemyWalking(),520,323);
        addObject(new EnemyWalking(),320,323);
        addObject(new EnemyShootingFly(),540,60);

        addObject(new ItemElementBronze(),57,313);

        addObject(new ItemGem(),250,68);
        addObject(new ItemGem(),300,68);
        addObject(new ItemGem(),350,68);
        addObject(new ItemGem(),250,283);
        addObject(new ItemGem(),300,283);
        addObject(new ItemGem(),350,283);
        addObject(new ItemGem(),275,253);
        addObject(new ItemGem(),325,253);
        addObject(new ItemGem(),541,115);
        addObject(new ItemGem(),541,145);
        addObject(new ItemGem(),541,175);
        addObject(new ItemGem(),541,205);
        addObject(new ItemGem(),541,235);

        addObject(new ItemLife(),541,313);
    }
}
