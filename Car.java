public class Car {
 
    
    private int speed;
    private double regularPrice;
    private String Color;
    
    public Car(int speed, double regularPrice,String Color){

        this.speed = speed;
        this.regularPrice = regularPrice;
        this.Color = Color;
    }

    public double getSalePrice(){
        return regularPrice;
    }
}
