import java.util.Scanner;
public class ucgenalanhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a; int b; int c; int ucgencevresi; int ucgenalanınkaresi;

        System.out.println("a için Sayıyı giriniz : ");
        a = input.nextInt() ;

        System.out.println("b için Sayıyı giriniz : ");
        b =input.nextInt() ;

        System.out.println("c için Sayıyı giriniz : ");
        c =input.nextInt() ;

        ucgencevresi = (a+b+c)/2;
        ucgenalanınkaresi = (ucgencevresi*(ucgencevresi-a)*(ucgencevresi-b)*(ucgencevresi-c));

        System.out.println(ucgencevresi);
        System.out.println(Math.sqrt(ucgenalanınkaresi));














    }
}
