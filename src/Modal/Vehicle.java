package Modal;

public class Vehicle {
String vehicleName;
String vechicleType;

String vehileModel;


    public Vehicle(String vehicleName, String vechicleType, String vehileModel) {
        this.vehicleName = vehicleName;
        this.vechicleType = vechicleType;
        this.vehileModel = vehileModel;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehileModel() {
        return vehileModel;
    }

    public void setVehileModel(String vehileModel) {
        this.vehileModel = vehileModel;
    }


}
