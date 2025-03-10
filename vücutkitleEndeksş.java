import java.util.Scanner;
public class vücutkitleEndeksş {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kilo , boy , vucutkitleendeksi;

        System.out.println("Lütfen vücudunuzun KG cinsinden kilonuzu giriniz !: ");
        kilo = input.nextDouble();

        System.out.println("Lütfen vücudunuzun metre cinsinden boyunuzu giriniz !:" );
        boy = input.nextDouble() ;

        vucutkitleendeksi = kilo/(boy*boy) ;
        System.out.println("Metre cinsinden boyunuz : " + boy);
        System.out.println("Kilogram cinsinden kilonuz : " + kilo);
        System.out.println("Vucut kitle Endeksiniz:  " + vucutkitleendeksi);




    }
}
