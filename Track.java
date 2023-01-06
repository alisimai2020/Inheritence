public class Track extends Car {


    private int weight;
    public Track(int speed, double regularPrice, String Color,int weight) {
        super(speed, regularPrice, Color);
        this.weight =weight;
    }
    
    public double getSalePrice(){
        if (weight > 200){
            return super.getSalePrice() -(0.1*super.getSalePrice());
        }
        else{
                return super.getSalePrice() -(0.2*super.getSalePrice());
        }
    }
}
