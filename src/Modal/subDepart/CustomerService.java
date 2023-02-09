package Modal.subDepart;

import Modal.SubBranch;

public class CustomerService extends SubBranch {

    public String name;
    public    String opening_time;
    public String closing_time;
    public String contact;
    String avialable_time;

    public CustomerService(String name, String type, String name1, String opening_time, String closing_time, String contact, String avialable_time) {
        super(name, type);
        this.name = name1;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
        this.contact = contact;
        this.avialable_time = avialable_time;
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

    public String getAvialable_time() {
        return avialable_time;
    }

    public void setAvialable_time(String avialable_time) {
        this.avialable_time = avialable_time;
    }
}
