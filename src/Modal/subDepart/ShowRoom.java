package Modal.subDepart;

import Modal.SubBranch;

public class ShowRoom  extends SubBranch {
    String avialable_cars;

    public ShowRoom(String type, String name, String opening_time, String closing_time, String contact, String avialable_cars) {
        super(type, name, opening_time, closing_time, contact);
        this.avialable_cars = avialable_cars;
    }

    public void depart_info () {
        super.depart_info();
        System.out.println("cars aviliable:"+avialable_cars);
    }
}
