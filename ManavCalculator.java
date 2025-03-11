import java.util.Scanner;
public class ManavCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int armut ,elma, domates , muz, patlıcan ;

        System.out.println("Armut Kaç Kilo ? : ");
        armut = input.nextInt();

        System.out.println("Elma Kaç Kilo ? : ");
        elma = input.nextInt();

        System.out.println("Domates Kaç Kilo ? : ");
        domates = input.nextInt();

        System.out.println("Muz Kaç Kilo ? : ");
        muz = input.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        patlıcan = input.nextInt();


        int x = (patlıcan + muz + domates + elma +armut );
        System.out.println(" Toplam ödenecek Para :" + x + " TL");




    }
}
