public class Ford extends Car {
  
    private int year;
    private int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String Color,int year,int manufacturerDiscount) {
        super(speed, regularPrice, Color);
       this.manufacturerDiscount =manufacturerDiscount;
       this.year=year;
    }

    public double getSalePrice(){

        return super.getSalePrice() - manufacturerDiscount;
    }
    
}
