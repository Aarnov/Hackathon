package Modal;


public class Departments extends SubBranch {

    String depart_name;
    String depart_type;
    String opening_time ;
    String closing_time ;

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public String getDepart_type() {
        return depart_type;
    }

    public void setDepart_type(String depart_type) {
        this.depart_type = depart_type;
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

    public Departments(String depart_name, String depart_type, String opening_time, String closing_time) {
        this.depart_name = depart_name;
        this.depart_type = depart_type;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
    }

    public Departments() {
        this.depart_name = depart_name;
        this.depart_type = depart_type;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
    }



    public void depart_info() {
        System.out.println("Department name:"+this.depart_name+"-"+this.location);
        System.out.println("Department type:"+this.depart_type);
        System.out.println("Department Open time:"+this.opening_time);
        System.out.println("Department Closing time:"+this.closing_time);
    }


}