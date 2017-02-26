import java.util.ArrayList;
import java.util.Scanner;
public class House extends FarmingSimulatorRunner
{
    private int numworkers;
    private double happiness;
    ArrayList<Workers> workers;
    ArrayList<Workers> hworkers = new ArrayList<Workers>();
    private int option;
    private Scanner scanner = new Scanner(System.in);
    
    
    public House(ArrayList<Workers> w)
    {
        numworkers = 0;
        happiness = 50.0;
        workers = w;
        for(int i=0; i<workers.size(); i++)
        {
            if(workers.get(i).getOcc() == Occupation.HOUSEWORKER)
            {
                hworkers.add(workers.get(i));
            }
        }
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
        System.out.println("What would you like to do? Add Workers?(1)  Remove Workers(2) PrintWorkers (3) Print HouseWorkers(4)");
        option = scanner.nextInt();
        switch(option)
        {
            case 1: 
            case 2:
            case 3: super.printWorkers();
            case 4: super.printWorkers(hworkers);
            default: optionSelect();
        }
    }
}