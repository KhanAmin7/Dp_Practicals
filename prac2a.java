class Phone {
    private String brand;
    private String model;
    private String screenSize;
    private String batteryCapacity;
    private String cameraResolution;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", Screen Size: " + screenSize + ", Battery Capacity: " + batteryCapacity
                + ", Camera Resolution: " + cameraResolution;
    }
}

class PhoneBuilder{
    private String brand;
    private String model;
    private String screenSize;
    private String batteryCapacity;
    private String cameraResolution;
    public PhoneBuilder(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }
    public PhoneBuilder setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
        return this;
    }
    public Phone Build(){
        Phone phone= new Phone(brand,model);
        phone.setScreenSize(screenSize);
        phone.setBatteryCapacity(batteryCapacity);
        phone.setCameraResolution(cameraResolution);
        return phone;
    }

    class prac2a{
        public static void main(String[] args) {
            PhoneBuilder builder = new PhoneBuilder("Samsung", "S24 Ultra");
            Phone phone = builder.setBatteryCapacity("4600 mh").setCameraResolution("65mp").Build();
            System.out.println(phone);
        }
    }
   
}