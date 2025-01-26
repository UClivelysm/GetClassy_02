import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SafeInputObj sio= new SafeInputObj(in);

        Product gunpla1 = new Product("000001","Perfect Grade Unleashed RX-78-2 Gundam","1/60 scale model of the RX-78-2 Gundam", 295.99);
        Product gunpla2 = new Product("000002","Master Grade Zeta Gundam Ver.Ka","1/100 scale model of the Zeta Gundam designed by Ka",79.99);

        System.out.println(gunpla1.getName());
        System.out.println(gunpla2.getDescription());
        System.out.println(gunpla2.toCSV());

        System.out.println(gunpla1.toJSON());
        System.out.println(gunpla2.toXML());

//        String id = sio.getNonZeroLenString("Enter Your ID");
//        System.out.println("ID is " + id);


    }
}
