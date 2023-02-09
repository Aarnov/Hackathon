package Modal.subDepart;

import Modal.Departments;

public class ShowRoom  extends Departments {
    int showing_cars ;

    public ShowRoom(String depart_name, String depart_type, String opening_time, String closing_time, int showing_cars) {
        super();
        this.showing_cars = showing_cars;
    }
    @Override
    public void depart_info () {
        if(isHasShowroom()==true){
            super.depart_info();
            System.out.println("Showing cars:"+this.showing_cars);
        }
        else {
            System.out.println("The selected location doesnt have any showroom.");
        }

    }

}
