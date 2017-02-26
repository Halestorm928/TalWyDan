import java.util.ArrayList;
import java.util.Scanner;
public class House extends FarmingSimulatorRunner
{
    private int numworkers;
    private double happiness;
    ArrayList<Workers> workers;
    ArrayList<Workers> hworkers;// = new ArrayList<Workers>();
    private int option;
    Scanner scanner = new Scanner(System.in);
    //private int count;
    
    public House(ArrayList<Workers> w)
    {
        numworkers = 0;
        happiness = 50.0;
        workers = w;
        hworkers = new ArrayList<Workers>(workers);
    }
    
    public void setWorkers(ArrayList<Workers> w)
    {
        //count = 0;
        workers = w;
        //count = workers.size();//notused
        
        hworkers = new ArrayList<Workers>(workers);
        
        for(int i = 0; i < hworkers.size(); i++)
        {
            if(workers.get(i).getOcc() != Occupation.HOUSEWORKER)
            {
                hworkers.remove(i);
                i--;
            }
        }
        
        
        /*
        for(int i=0; i<workers.size(); i++)
        {
            if(workers.get(i).getOcc() == Occupation.HOUSEWORKER)
            {
                hworkers.add(workers.get(i));    
                System.out.println(""+i);
            }
        }
        */
        
        //System.out.println(workers);
        //System.out.println(hworkers);
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
            case 1: break;
            case 2:
                System.out.println("Here are your workers..." + "\n" + super.printWorkers(hworkers)+ "\n\nWhich would you like to remove from the house?");
                String nameoption = scanner.next();
                for(int i=0; i<hworkers.size(); i++)
                {
                    if(hworkers.get(i).name.equals(nameoption))
                       {hworkers.remove(i); System.out.print("Worker Removed from House\n");}
                    else 
                    {
                        System.out.println("Worker Not Found");
                    }
                }
                break;
            case 3: System.out.println(super.printWorkers()); break;
            case 4: System.out.println(super.printWorkers(hworkers)); break;
            default: optionSelect(); break;
        }
    }
}