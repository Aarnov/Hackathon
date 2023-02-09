package Modal.subDepart;

import Modal.SubBranch;

public class ShowRoom  extends SubBranch {
    public String name;
    public    String opening_time;
    public String closing_time;
    public String contact;
    String avialable_cars;


    public ShowRoom(String name, String type, String name1, String opening_time, String closing_time, String contact, String avialable_cars) {
        super(name, type);
        this.name = name1;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
        this.contact = contact;
        this.avialable_cars = avialable_cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpening_time() {
        return opening_time;
    }

    public void setOpening_time(String opening_time) {
        this.opening_time = opening_time;
    }

    public String getClosing_time() {
        return closing_time;
    }

    public void setClosing_time(String closing_time) {
        this.closing_time = closing_time;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAvialable_cars() {
        return avialable_cars;
    }

    public void setAvialable_cars(String avialable_cars) {
        this.avialable_cars = avialable_cars;
    }
//    public void depart_info () {
//        super.depart_info();
//        System.out.println("cars aviliable:"+avialable_cars);
//    }
}
