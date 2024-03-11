final class Singleton{
    private static Singleton instance;
    public String value;
    private Singleton(String value){
        try{
            Thread.sleep(1000);

        }
        catch (Exception e){

        }
        this.value = value;
    }
    public static Singleton getinstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
class prac2b2{
    public static void main(String[] args) {
        Singleton s1 =  Singleton.getinstance("Hello Fucking world");
        Singleton s2 =  Singleton.getinstance("World is under a Matrix");
        System.out.println(s1.value);
        System.out.println(s2.value);
    }
}