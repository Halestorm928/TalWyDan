import java.util.ArrayList;
public class Fields extends FarmingSimulatorRunner
{
    private int numworkers;
    private int cropamount;
    ArrayList<Workers> workers;
    ArrayList<Workers> fworkers = new ArrayList<Workers>();
    private int count;
    private int option;
    
    public Fields(ArrayList<Workers> w)
    {
        numworkers = 0;
        cropamount = 0;
        workers = w;
    }
    public void setWorkers(ArrayList<Workers> w)
    {
        count = 0;
        workers = w;
        for(int i = 0; i < workers.size(); i++)
        {
            if(workers.get(i).getOcc() == Occupation.FIELDWORKER)
            {
                fworkers.add(workers.get(i));
                count++;
            }
        }
    }
    public ArrayList<Workers> getWorkers()
    {
        return workers;
    }
    
    public void optionSelect()
    {
       System.out.println("What would you like to do? Add Workers?(1)  Remove Workers(2) PrintWorkers (3) Print Field Workers(4)");
       option = scanner.nextInt();
        switch(option)
        {
            case 1: break;
            case 2:
                System.out.println("Here are your workers..." + "\n" + super.printWorkers(fworkers)+ "\n\nWhich would you like to remove from the fields?");
                String nameoption = scanner.next();
                for(int i=0; i<count; i++)
                {
                    if(fworkers.get(i).name.equals(nameoption))
                        {fworkers.remove(i); System.out.print("Worker Removed from House\n");}
                    else 
                    {
                        System.out.println("Worker Not Found");
                    }
                }
                break;
            case 3: super.printWorkers(); break;
            case 4: super.printWorkers(fworkers); break;
            default: optionSelect(); break;
       }
    }
}