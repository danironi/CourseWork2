package step1;


import java.util.LinkedList;

public class Dealership {
    private int dealershipId;
    private LinkedList<Make> makes = new LinkedList<Make>();

    /*public static Linked*/
    public void addMake(Make make){

            makes.add(make);

    }

    public boolean findMakeName(String makeName){
        int i = 0;
        while (makes.size()>i){
            if(makes.get(i).getMakeName().equals(makeName)){
                return true;
            }
            i++;
        }
        return false;
    }

    public Make getMakeName(String makeName) {
        int i = 0;
        while (makes.size() > i) {
            if (makes.get(i).getMakeName().equals(makeName)) {
                return makes.get(i);
            }
            i++;
        }
        return null;
    }

    public void displayAll(){

        for(Make make: makes){
            System.out.println(make);
        }
    }

    public int listSize(){
        return makes.size();
    }

    public boolean isEmpty(){
        if (listSize()==0){
            return true;
        }
        return false;
    }

    public void removeMake(Make make){
        this.makes.remove(make);
    }
}
