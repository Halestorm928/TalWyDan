import java.util.ArrayList;
public class Fields extends FarmingSimulatorRunner
{
    private int numworkers;
    private int cropamount;
    ArrayList<Workers> workers;
    ArrayList<Workers> fworkers = new ArrayList<Workers>();
    private int count;
    private int option;
    private int number;
    
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
       number = 0;
       System.out.println("What would you like to do? Add Workers?(1)  Remove Workers(2) PrintWorkers (3) Print HouseWorkers(4)");
       option = scanner.nextInt();
        switch(option)
        {
            case 1: break;
            case 2:
                System.out.println("Here are your field workers..." + "\n" + super.printWorkers(Occupation.FIELDWORKER)+ "\n\nWhich would you like to remove from the fields?");
                String nameoption = scanner.next();
                for(int i=0; i<workers.size(); i++)
                {
                    if(workers.get(i).name.equals(nameoption))
                    {   
                        workers.get(i).occupation = Occupation.NOTWORKING; 
                        System.out.println("Worker Removed from House"); 
                        number++;
                        clearscreen.ClearScreen();
                    }
                    else if(number < 1)
                    {
                        clearscreen.ClearScreen();
                        
                        System.out.println("Worker Not Found");
                        System.out.println();
                    }
                }
                break;
            case 3: System.out.println(super.printWorkers()); break;
            case 4: System.out.println(super.printWorkers(Occupation.FIELDWORKER)); break;
            default: optionSelect(); break;
       }
   }
}