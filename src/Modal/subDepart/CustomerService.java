package Modal.subDepart;

import Modal.SubBranch;

public class CustomerService extends SubBranch {

    String avialable_time;

    public CustomerService(String type, String name, String opening_time, String closing_time, String contact, String avialable_time) {
        super(type, name, opening_time, closing_time, contact);
        this.avialable_time = avialable_time;
    }

    public String getAvialable_time() {
        return avialable_time;
    }

    public void setAvialable_time(String avialable_time) {
        this.avialable_time = avialable_time;
    }
}
