package step1;

import java.util.HashSet;
import java.util.Set;

public class DealershipTest {
    static Dealership dealership = new Dealership();

    public static void main(String[] args){
        do{
            try{

                String menu = "Enter one of the following options: \n"+
                        "1 - Add a new make of car \n" +
                        "2 - Find a specific make of car \n" +
                        "3 - Remove a specific make of car \n" +
                        "4 - Display all the makes of cars \n" +
                        "5 - Quit \n" +
                        ">>";

                int option = Input.getInteger(menu);

                switch(option){

                    case 1:

                        String makeName = Input.getString("Enter Make name: ");

                        if(!dealership.findMakeName(makeName)){
                            Make make1 = new Make(makeName);
                            dealership.addMake(make1);
                            System.out.println("Make has been added.");

                        }
                        else{
                        System.out.println("Make already exists.");
                        }
                        break;

                    case 2:

                        makeName = Input.getString("Enter Make name: ");

                        if(dealership.findMakeName(makeName)){
                            System.out.println("There is "+makeName+" sold by the dealership.");
                        }
                        else{
                            System.out.println("There is no such make within the dealership.");
                        }
                        break;
                    case 3:

                        if(dealership.isEmpty()){
                            noMake();
                        }
                        else{
                            makeName = Input.getString("Enter Make name: ");
                            Make make = dealership.getMakeName(makeName);
                            if(make!=null){
                                dealership.removeMake(make);
                                System.out.println("Make has been removed.");
                            }
                            else{
                                System.out.println("There is no such make within the dealership.");
                            }
                        }
                        break;
                    case 4:

                        if(dealership.isEmpty()){
                            noMake();
                        }
                        else{
                            System.out.println("Make/manufacturer: \n");
                            dealership.displayAll();
                        }

                        break;

                    case 5:

                        Set<String> answers = new HashSet<String>();
                        answers.add("y");
                        answers.add("Y");

                        String answer= Input.getString("Quit? (y/n)");
                        if (answers.contains(answer)){
                            System.exit(0);
                        }
                    default:
                        System.out.println("If you wish to continue, then enter the right menu option. ");

                }

            }
            catch(Exception e){
                System.out.println("If you wish to continue, then enter the right menu option. ");
            }

        }
        while(Repeat.repeat());
    }
    public static void noMake(){
        System.out.println("There is no make within the dealership.");
    }
}
