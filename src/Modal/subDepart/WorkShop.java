package Modal.subDepart;

import Modal.Departments;

public class WorkShop extends Departments {

    String parts_aviliable ;

    public WorkShop(String depart_name, String depart_type, String opening_time, String closing_time, String parts_aviliable) {
        super();
        this.parts_aviliable = parts_aviliable;
    }
@Override public  void depart_info() {
    if(isHasWorkshop()==true){
        super.depart_info();
        System.out.println("Aviliable parts:"+parts_aviliable);
    }
    else {
        System.out.println("The selected location doesnt have any showroom.");
    }


}
}
