package Modal;

import java.util.ArrayList;
import java.util.Scanner;

public class SubBranch {
    String  location;
     boolean hasShowroom;

    boolean hasWorkshop ;

ArrayList<Departments> departments;

    public SubBranch(String location, boolean hasShowroom, boolean hasWorkshop, ArrayList<Departments> departments) {
        this.location = location;
        this.hasShowroom = hasShowroom;
        this.hasWorkshop = hasWorkshop;
        this.departments = departments;
    }

    public SubBranch() {

    }

    public ArrayList<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Departments> departments) {
        this.departments = departments;
    }

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
        this.location = sc.next();
        System.out.println(location);
        System.out.println("Does it have showroom (y/n)");
        String res = sc.next();
        if (res.equalsIgnoreCase("y")){
            this.hasShowroom = true ;

        } else {
            this.hasShowroom = false;
        }
        System.out.println("Does it have a workshop (y/n)");
        String res1 = sc.next();
        if (res1.equalsIgnoreCase("y")){
            this.hasWorkshop = true ;
        } else {
            this.hasWorkshop = false;
        }
    }
public void  depart_info() {
    System.out.println("Department location:"+this.location);
}

}
