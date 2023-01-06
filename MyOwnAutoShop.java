public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(22, 200000.0,"Red", 20);

        System.out.println("the price of sedan => " + sedan.getSalePrice());

        System.out.println("...................................................................");

        Ford ford1 = new Ford(200,500000.0,"pink",2022,10);
        System.out.println("the price of first ford => " + ford1.getSalePrice());

        System.out.println("...................................................................");

        Ford ford2 = new Ford(600,700000.0,"black",200,5);

        System.out.println("the price of second ford => " + ford2.getSalePrice());

        System.out.println("...................................................................");

       Car car = new Car(200,303000.0, "RED");
       System.out.println("the price of car  => " + car.getSalePrice());
        
    }
}
