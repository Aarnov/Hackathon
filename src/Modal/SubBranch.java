package Modal;

import java.util.ArrayList;
import java.util.Scanner;

public class SubBranch {
    String  location;
    boolean hasShowroom;

    boolean hasWorkshop ;

ArrayList<Departments> departments;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isHasShowroom() {
        return hasShowroom;
    }

    public void setHasShowroom(boolean hasShowroom) {
        this.hasShowroom = hasShowroom;
    }

    public boolean isHasWorkshop() {
        return hasWorkshop;
    }

    public void setHasWorkshop(boolean hasWorkshop) {
        this.hasWorkshop = hasWorkshop;
    }


    public void addBranch() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter location");
        location = sc.next();
        System.out.println("Does it have showroom (y/n)");
        String res = sc.next();
        if (res.equalsIgnoreCase("y")){
            hasShowroom = true ;

        } else {
            hasShowroom = false;
        }
        System.out.println("Does it have a workshop (y/n)");
        String res1 = sc.next();
        if (res1.equalsIgnoreCase("y")){
            hasWorkshop = true ;
        } else {
            hasWorkshop = false;
        }
    }


}
