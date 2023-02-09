package Modal.subDepart;

import Modal.Departments;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkShop extends Departments {

    String parts_aviliable ;

    public WorkShop(String location, boolean hasShowroom, boolean hasWorkshop, ArrayList<Departments> departments, String depart_name, String depart_type, String opening_time, String closing_time, String parts_aviliable) {
        super(location, hasShowroom, hasWorkshop, departments, depart_name, depart_type, opening_time, closing_time);
        this.parts_aviliable = parts_aviliable;
    }

    @Override public void enter_depart_info() {
        super.enter_depart_info();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of parts aviliable ");
        this.parts_aviliable = sc.next();
    }

    @Override public  void depart_info() {
    if(this.isHasWorkshop()){
        super.depart_info();
        System.out.println("Aviliable parts:"+parts_aviliable);
    }
    else {
        System.out.println("The selected location doesnt have any showroom.");
    }


}
}
