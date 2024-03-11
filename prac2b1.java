class SingleObj{
    private static SingleObj instance = new SingleObj();
    private SingleObj(){
    
    }

    public static SingleObj getinstance(){
        return  instance;
    }
    public void msg(){
        System.out.println("Hello World!");
    }
}
public class prac2b1{
    public static void main(String[] args) {
        SingleObj obj = SingleObj.getinstance();
        obj.msg();
    }
}
