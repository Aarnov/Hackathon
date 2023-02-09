package Modal;


import Modal.subDepart.CustomerService;
import Modal.subDepart.ShowRoom;
import Modal.subDepart.WorkShop;

public class Appointment  {
    User user;
    CustomerService cs;
    ShowRoom sr;
    WorkShop ws;

    public Appointment(User user, CustomerService cs, ShowRoom sr, WorkShop ws) {
        this.user = user;
        this.cs = cs;
        this.sr = sr;
        this.ws = ws;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CustomerService getCs() {
        return cs;
    }

    public void setCs(CustomerService cs) {
        this.cs = cs;
    }

    public ShowRoom getSr() {
        return sr;
    }

    public void setSr(ShowRoom sr) {
        this.sr = sr;
    }

    public WorkShop getWs() {
        return ws;
    }

    public void setWs(WorkShop ws) {
        this.ws = ws;
    }

    public void appointment_cs(){
        System.out.println(getUser().+" has booked and appointment at our servicing center located at "+getCs().;
    }
}
