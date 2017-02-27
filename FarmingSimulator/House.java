import java.util.ArrayList;
import java.util.Scanner;
public class House extends FarmingSimulatorRunner
{
    //ArrayList<Workers> workers;
    ClearScreen clearscreen = new ClearScreen();
    Scanner scanner = new Scanner(System.in);
    
    private int numworkers;
    private double happiness;
    int option;
    int number;
    
    private String response;
    
    public House()
    {
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
        clearscreen.ClearScreen();
        number = 0;
        System.out.println("HOUSE:\n\nWhat would you like to do? Add Workers?(1)  Remove Workers(2) PrintWorkers (3) Print House Workers(4)");
        option = scanner.nextInt();
        switch(option)
        {
            case 1: 
                clearscreen.ClearScreen();
                System.out.println("Here are all of your workers...." + "\n" + super.printWorkers() + "\n\n Which would you like to add to the house?");
                response = scanner.next();
                
                for(int i=0; i<super.workers.size(); i++)
                {
                        if(super.workers.get(i).name == response)
                            {
                                super.workers.get(i).setOcc(Occupation.HOUSEWORKER);
                                System.out.println("\nOccupation Switched\n");
                            }
                }
            break;
            case 2:
                clearscreen.ClearScreen();
                System.out.println("Here are your house workers..." + "\n" + super.printWorkers(Occupation.HOUSEWORKER)+ "\n\nWhich would you like to remove from the house?");
                String nameoption = scanner.next();
                for(int i=0; i<workers.size(); i++)
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
            case 4: clearscreen.ClearScreen(); System.out.println(super.printWorkers(Occupation.HOUSEWORKER)); break;
            default: optionSelect(); break;
        }
    }
}