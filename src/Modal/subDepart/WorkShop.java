package Modal.subDepart;

import Modal.SubBranch;

public class WorkShop extends SubBranch {

    String aviliable_parts;

    public WorkShop(String type, String name, String opening_time, String closing_time, String contact, String aviliable_parts) {
        super(type, name, opening_time, closing_time, contact);
        this.aviliable_parts = aviliable_parts;
    }

    public String getAviliable_parts() {
        return aviliable_parts;
    }

    public void setAviliable_parts(String aviliable_parts) {
        this.aviliable_parts = aviliable_parts;
    }

    @Override  public void depart_info() {

        super.depart_info();

        System.out.println("Number of aviliable parts : "+this.aviliable_parts);
    }
}
