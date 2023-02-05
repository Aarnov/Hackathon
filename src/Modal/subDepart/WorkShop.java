package Modal.subDepart;

import Modal.Departments;

public class WorkShop extends Departments {

    String parts_aviliable ;

    public WorkShop(String depart_name, String depart_type, String opening_time, String closing_time, String parts_aviliable) {
        super(depart_name, depart_type, opening_time, closing_time);
        this.parts_aviliable = parts_aviliable;
    }
@Override public  void depart_info() {
 super.depart_info();
    System.out.println("Aviliable parts:"+parts_aviliable);
}
}
