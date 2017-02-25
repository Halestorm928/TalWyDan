public class Workers //extends FarmingSimulatorRunner
{
    private String name;
    private int curhp, maxhp;
    private int strength;
    private int curexp, maxexp, level;
    static private double revoltChance;
    static public int totalnum = 0;
    
    public Workers()
    {
        name = "Talbot";
        curhp = maxhp = 100;
        strength = 1;
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
        totalnum++;
    }
    
    public Workers(String workerName)
    {
        name = workerName;
        curhp = maxhp = 100;
        strength = (int)(Math.ceil(Math.random()*10));
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
        revoltChance += .01;
        totalnum++;
    }

    public Workers(String workerName, int workerHealth, int workerStrength )
    {
        name = workerName;
        curhp = maxhp = workerHealth;
        strength = workerStrength;
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
        revoltChance += .01;
        totalnum++;
    }
    
    public String getName()
    {
        return name;
    }
}
    
    