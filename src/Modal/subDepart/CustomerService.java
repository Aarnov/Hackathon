package Modal.subDepart;

import Modal.Departments;

public class CustomerService  extends Departments {
int operators;

    public CustomerService(String depart_name, String depart_type, String opening_time, String closing_time, int operators) {
        super(depart_name, depart_type, opening_time, closing_time);
        this.operators = operators;

    }

   @Override  public void depart_info() {
        super.depart_info();
       System.out.println("Number of operators : "+this.operators);
}
}
