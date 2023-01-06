public class Sedan extends Car {

    private int length;

  
    public Sedan(int speed, double regularPrice, String Color,int length) {
        super(speed, regularPrice, Color);
        this.length = length;
        
    }

    public double getSalePrice(){
        if(length >20){
          return super.getSalePrice() -(0.05*super.getSalePrice());
        }
        else{
            return super.getSalePrice() -(0.1*super.getSalePrice());
        }
    }
    
 

}
