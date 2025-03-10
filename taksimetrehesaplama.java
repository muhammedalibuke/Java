import java.util.Scanner;
public class taksimetrehesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kmBasinaPara; double taksimetrePara = 10 , toplamanapara , km;

        System.out.println("Gidilecek Km sayısını giriniz ! : ");
        km = input.nextDouble();

        toplamanapara = km*2.2 + taksimetrePara ;
        toplamanapara = (toplamanapara < 20 ) ?  20 :toplamanapara;
        
        System.out.println("Oluşan para miktarı: " + toplamanapara + " TL");












    }
}
