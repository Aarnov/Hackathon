package Modal.subDepart;

import Modal.SubBranch;

public class WorkShop extends SubBranch {
    public String name;
    public    String opening_time;
    public String closing_time;
    public String contact;
    String aviliable_parts;

    public WorkShop(String name, String opening_time, String closing_time, String contact, String type, String name1, String opening_time1, String closing_time1, String contact1, String aviliable_parts) {
        super(name, opening_time, closing_time, contact, type);
        this.name = name1;
        this.opening_time = opening_time1;
        this.closing_time = closing_time1;
        this.contact = contact1;
        this.aviliable_parts = aviliable_parts;
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

    public String getAviliable_parts() {
        return aviliable_parts;
    }

    public void setAviliable_parts(String aviliable_parts) {
        this.aviliable_parts = aviliable_parts;
    }
}
