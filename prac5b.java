interface Order{
  double getPrice();
}
class BasicOrder implements Order{
  private double price;
  public BasicOrder(double price){
    this.price = price;
  }
  @Override
  public double getPrice(){
    return price;
  }
}
class TaxDecorator implements Order{
  private final Order order;
  private final double taxrate;
  public TaxDecorator(Order order, double taxrate){
    this.order = order;
    this.taxrate = taxrate;
  }
  @Override
  public double getPrice() {
    double basePrice = order.getPrice();
    double taxamt = basePrice * taxrate;
    return basePrice + taxamt;
  }
}


public class prac5b {
  public static void main(String[] args) {
    Order basicorder = new BasicOrder(100);
    Order taxedorder = new TaxDecorator(basicorder, 0.07 );
    System.out.println("Basic Order: "+basicorder.getPrice());
    System.out.println("Taxed Order: "+taxedorder.getPrice());
  }
}