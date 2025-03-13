import java.util.Scanner;
public class KDVtutar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdvDegeri;

        System.out.print("KDV hesabı için tutar giriniz: ");
        tutar = input.nextDouble();

        if (tutar >= 0 && tutar <= 1000) {

            kdvDegeri = (tutar * 18) / 100;
            System.out.println("KDV TUTARI :" + kdvDegeri);
        } else {
            kdvDegeri = (tutar * 8) / 100;
            System.out.println("KDV TUTARI : " + kdvDegeri);
            input.close();
        }
    }
}