import java.util.Scanner;
public class iflerlebasiccalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a , b, select ;

        System.out.println("İlk sayınızı giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci sayınızı giriniz : ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Enter your select for your calculate : ");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Toplam = " + (a +b));}

            else if (select == 2){
                System.out.println("çıkarma = " + (a -b));}

                else if(select == 3){
                    System.out.println("çarpma = " + (a*b));}

                        else if(select == 4){
                            if(b!=0)
                            System.out.println("bölme = " + (a / b));
                            else {
                                System.out.println("Bir sayı 0 a bölünemez ");
                            }
                        }

        else {
            System.out.println("you did enter wrong number, if you wanna be work on the code pls start from beginner");

        }
                }
            }





