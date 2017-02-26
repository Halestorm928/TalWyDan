
/*
 Runner<-[FarmingSimulator]
*/

import java.util.Scanner;
import java.util.ArrayList;


public class FarmingSimulatorRunner
{
    static boolean isGameRunning = true;
    
    static protected String playername;
    static protected int money = 0;
    static private String name;
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Workers> workers;
    static House house;
    static Fields field;
    static Store store;
    static ClearScreen clearscreen;
    
    public static void main(String args[])
    {
        
        
        System.out.println("Welcome to Farming Simulator. You just inherited 5 acres of land. What is your name?");
        playername = scanner.next();
        System.out.println("Hello, " + playername + ". Press enter to begin...");
        scanner.nextLine();
        scanner.nextLine();
        clearscreen.ClearScreen();
        
        
        
        workers = new ArrayList<Workers>();
        house = new House(workers);
        field = new Fields(workers);
        store = new Store(workers);
        
        
        System.out.println("What do you want the name of your first worker to be...?");
        name = scanner.next();
        
        addWorker(name, 100, 5, 2);
        
        while(isGameRunning)
        {
            teleport();
        }
    }
    
    public static void teleport()
    {
        int option = 0;
        System.out.println("Where would you like to go?  House(1)  Fields(2)  Store(3)");
        option = scanner.nextInt();
        switch(option)
        {
            case 1: house.optionSelect(); break; // write optionselect
            case 2: field.optionSelect(); break; // write optionselect
            case 3: store.optionSelect(); break; // write optionselect
            default: teleport(); break;
        }
    }
    
    public static void addWorker(String workerName, int health_param, int strength_param, int occupation)
    {
        workers.add(new Workers(workerName,health_param,strength_param, occupation));
    }
    
    public static void removeWorker(String name)
    {
        for(int i=0;i<workers.size(); i++)
         {
            if(workers.get(i).getName().equals(name))
                workers.remove(i);
            }
    }
    public static String printWorkers()
    {
        for(Workers d : workers)
        {
            System.out.println(d.name + " " + occupation);
        }
    }
}

// http://collabedit.com/aay73 -- workers class
// http://collabedit.com/48326 -- house class
// http://collabedit.com/37dng -- store class
// http://collabedit.com/pt8gu -- field class
// http://collabedit.com/p7dmv -- clear screen