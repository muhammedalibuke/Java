import java.util.Scanner;
public class DaireDilimAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r , alpha , dairedilimininalanı, alan;

        System.out.println("Daire dilim alanı için r değerini giriniz! : " );
        r = input.nextDouble();

        System.out.println("Daire dilim alanı için alpha değerini giriniz! : ");
        alpha = input.nextDouble();

        dairedilimininalanı= (Math.PI*r*r*alpha)/360;
        
        System.out.println(dairedilimininalanı);







    }
}
