import java.util.Scanner;

interface VehiclePrototype{
    VehiclePrototype clone();
}

class Vehicle implements  VehiclePrototype {
    private String type;
    public Vehicle(String type){
        this.type = type;
    
    }
    @Override
    public Vehicle clone(){
        return new Vehicle(this.type);
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public void display(){
        System.out.println("vehicle type: "+type);
    }
}

class prac3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle prototype = new Vehicle("Car");
        prototype.display();
        System.out.println("Enter a new Vehicle:");
        String v_type = sc.nextLine();
        Vehicle new_vehicle = prototype.clone();
        System.out.println( "\nnew vehicle" );
        new_vehicle.setType(v_type);
        new_vehicle.display();
    }
}