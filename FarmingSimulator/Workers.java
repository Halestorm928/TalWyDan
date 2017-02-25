public class Workers extends FarmingSimulatorRunner
{
    private String name;
    private int curhp, maxhp;
    private int strength;
    private int curexp, maxexp, level;
    static private double revoltChance;

    public Workers()
    {
        name = "Talbot";
        health = 100;
        strength = 1;
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
    }

    public Workers(String workerName, int workerHealth, int workerStrength )
    {
        name = workerName;
        health = workerHealth;
        strength = workerStrength;
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
        revoltChance += .01;
    }
}
    
    