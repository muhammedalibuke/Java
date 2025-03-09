package Nedemekistiyorsun;
import java.util.Scanner;

public class NotOrtalamasıJava101 {
        public static void main(String[] args) {
            String g = "GEÇTİ";
            String k = "KALDI";

            Scanner input = new Scanner(System.in);
            int matematikNot, turkceNot, fizikNot, tarihNot, kimyaNot, biyolojiNot;

            System.out.print("Matematik Notunuzu giriniz: ");
            matematikNot = input.nextInt();

            System.out.print("Türkçe Notunuzu giriniz: ");
            turkceNot = input.nextInt();

            System.out.print("Fizik Notunuzu giriniz: ");
            fizikNot = input.nextInt();

            System.out.print("Tarih Notunuzu giriniz: ");
            tarihNot = input.nextInt();

            System.out.print("Kimya Notunuzu giriniz: ");
            kimyaNot = input.nextInt();

            System.out.print("Biyoloji Notunuzu giriniz: ");
            biyolojiNot = input.nextInt();
                

            int toplam = (matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + biyolojiNot);
            double sonuc = toplam / 6.0;

            System.out.println("Ortalama: " + sonuc);
            System.out.println(sonuc >= 60.0 ? g : k);
        }
    }

