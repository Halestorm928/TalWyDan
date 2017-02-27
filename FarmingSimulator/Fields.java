import java.util.ArrayList;
public class Fields extends FarmingSimulatorRunner
{
    private int numworkers;
    private int cropamount;
    //ArrayList<Workers> workers = new ArrayList<Workers>();
    private int count;
    private int option;
    private int number;
    private String response = "";
    
    public Fields()
    {
        numworkers = 0;
        cropamount = 0;
    }
    
    public ArrayList<Workers> getWorkers()
    {
        return super.workers;
    }
    
    public void optionSelect()
    {
       clearscreen.ClearScreen();
       number = 0;
       System.out.println("FIELDS:\n\nWhat would you like to do? Add Workers?(1)  Remove Workers(2) PrintWorkers (3) Print Field Workers(4)");
       option = scanner.nextInt();
        switch(option)
        {
            case 1: 
                clearscreen.ClearScreen();
                System.out.println("Here are all of your workers...." + "\n" + super.printWorkers() + "\n\n Which would you like to add to the fields?");
                response = scanner.next();
                
                for(int i=0; i<super.workers.size(); i++)
                {
                        if(super.workers.get(i).name == response)
                            {
                                System.out.println("\nOccupation Switched\n");
                                super.workers.get(i).setOcc(Occupation.FIELDWORKER);
                            }
                }
            break;
            case 2:
                clearscreen.ClearScreen();
                System.out.println("Here are your field workers..." + "\n" + super.printWorkers(Occupation.FIELDWORKER)+ "\n\nWhich would you like to remove from the fields?");
                String nameoption = scanner.next();
                for(int i=0; i<super.workers.size(); i++)
                {
                    if(super.workers.get(i).name.equals(nameoption))
                    {   
                        super.workers.get(i).occupation = Occupation.NOTWORKING; 
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
            case 3: clearscreen.ClearScreen(); System.out.println(super.printWorkers()); break;
            case 4: clearscreen.ClearScreen(); System.out.println(super.printWorkers(Occupation.FIELDWORKER)); break;
            default: optionSelect(); break;
       }
   }
}