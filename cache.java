// Decorator pattern
interface Order {
    double getPrice();
  }
  
  class BasicOrder implements Order {
    private double price;
  
    public BasicOrder(double price) {
      this.price = price;
    }
  
    @Override
    public double getPrice() {
      return price;
    }
  }
  
  class TaxDecorator implements Order {
    private final Order order;
    private final double taxRate;
  
    public TaxDecorator(Order order, double taxRate) {
      this.order = order;
      this.taxRate = taxRate;
    }
  
    @Override
    public double getPrice() {
      double basePrice = order.getPrice();
      double taxAmount = basePrice * taxRate;
      return basePrice + taxAmount;
    }
  }
  
  public class prac5b {
    public static void main(String[] args) {
      Order order = new BasicOrder(100);
      Order taxedOrder = new TaxDecorator(order, 0.07); // 7% tax
  
      System.out.println("Basic price: $" + order.getPrice());
      System.out.println("Final price with tax: $" + taxedOrder.getPrice());
    }
  }
  