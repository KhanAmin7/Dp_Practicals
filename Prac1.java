interface Vehicle{
    void drive();
}

class Truck implements Vehicle{
    @Override
    public  void drive() {
        System.out.println("Driving a truck");
    }
}

class Car implements Vehicle{
    @Override
    public  void drive() {
        System.out.println("Driving a Car");
    }
}

class VehicleFactory{
    public static Vehicle createVehicle(String type){
        if (type.equalsIgnoreCase("Car")){
                return new Car();
        }
        else if(type.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else{
            throw new IllegalArgumentException( "Invalid vehicle type" +type);
        }
    }
}

public class Prac1 {

     public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("Car");
        car.drive();
        Vehicle truck = VehicleFactory.createVehicle("Truck");
        truck.drive();
     }
}