import java.util.ArrayList;
public class House extends FarmingSimulatorRunner
{
    private int numworkers;
    private double happiness;
    ArrayList<Workers> workers;
    public House(ArrayList<Workers> w)
    {
        numworkers = 0;
        happiness = 50.0;
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