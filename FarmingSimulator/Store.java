import java.util.ArrayList;
public class Store extends FarmingSimulatorRunner
{
    ArrayList<Workers> workers;
    public Store(ArrayList<Workers> w)
    {        
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
        System.out.println("What would you like to do? Buy Workers?(1)  Sell Workers(2)");
    }
}