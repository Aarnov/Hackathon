package Modal.subDepart;

import Modal.Departments;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService  extends Departments {
int operators;

    public CustomerService(String location, boolean hasShowroom, boolean hasWorkshop, ArrayList<Departments> departments, String depart_name, String depart_type, String opening_time, String closing_time, int operators) {
        super(location, hasShowroom, hasWorkshop, departments, depart_name, depart_type, opening_time, closing_time);
        this.operators = operators;
    }

    public CustomerService() {
        super();
    }


    @Override public void enter_depart_info() {
//        super.enter_depart_info();
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of operators ");
        this.operators = sc.nextInt();
}


   @Override  public void depart_info() {

        super.depart_info();

       System.out.println("Number of operators : "+this.operators);
}
}
