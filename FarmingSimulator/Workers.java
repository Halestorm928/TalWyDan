public class Workers //extends FarmingSimulatorRunner
{
    private String name;
    private int curhp, maxhp;
    private int strength;
    private int curexp, maxexp, level;
    static private double revoltChance;
    static public int totalnum = 0;
    
    public enum Occupation
    {
        NOTWORKING, HOUSEWORKER, FIELDWORKER
    }
    
    Occupation occupation;
    
    public Workers()
    {
        name = "Talbot";
        curhp = maxhp = 100;
        strength = 1;
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
        totalnum++;
        occupation = Occupation.NOTWORKING;
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
        occupation = Occupation.NOTWORKING;
    }

    public Workers(String workerName, int workerHealth, int workerStrength, int workerOcc )
    {
        name = workerName;
        curhp = maxhp = workerHealth;
        strength = workerStrength;
        curexp = 0;
        maxexp = 10;
        revoltChance = 0.0;
        revoltChance += .01;
        totalnum++;
        switch(workerOcc)
        {
            case(0): occupation = Occupation.NOTWORKING;      break;
            case(1): occupation = Occupation.HOUSEWORKER;     break;
            case(2): occupation = Occupation.FIELDWORKER;     break;
            default: occupation = Occupation.NOTWORKING; break;
        }        
    }
    
    public String getName()
    {
        return name;
    }
}
    
    