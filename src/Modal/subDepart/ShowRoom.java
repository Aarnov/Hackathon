package Modal.subDepart;

import Modal.Departments;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowRoom  extends Departments {
    int showing_cars ;

    public ShowRoom(String location, boolean hasShowroom, boolean hasWorkshop, ArrayList<Departments> departments, String depart_name, String depart_type, String opening_time, String closing_time, int showing_cars) {
        super(location, hasShowroom, hasWorkshop, departments, depart_name, depart_type, opening_time, closing_time);
        this.showing_cars = showing_cars;
    }

    @Override public void enter_depart_info() {
        super.enter_depart_info();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of showing cars");
        this.showing_cars = sc.nextInt();
    }

    @Override
    public void depart_info () {
        if(this.isHasShowroom()){
            super.depart_info();
            System.out.println("Showing cars:"+this.showing_cars);
        }
        else {
            System.out.println("The selected location doesnt have any showroom.");
        }

    }

}
