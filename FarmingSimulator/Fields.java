import java.util.ArrayList;
public class Fields extends FarmingSimulatorRunner
{
    private int numworkers;
    private int cropamount;
    ArrayList<Workers> workers;
    public Fields(ArrayList<Workers> w)
    {
        numworkers = 0;
        cropamount = 0;
        workers = w;
    }
    
    public void setWorkers(ArrayList<Workers> w)
    {
        workers = w;
    }
    public ArrayList<Workers> getWorkers()
    {
        return workers;
    }
    
    public void optionSelect()
    {
        System.out.println("What would you like to do? Add Workers?(1)  Remove Workers(2)");
    }
}