package java101;

import java.util.Scanner;
//not ortalaması hesaplayan program:
public class notOrtalama {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfını tanımla
        Scanner inp =new Scanner(System.in) ;

        //kullanıcıdan değerleri al
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız : " + sonuc);

        if (sonuc >= 60 ){
            System.out.println("Sınıfı geçtiniz!");
        }else{
            System.out.println("Sınıfta kaldınız!");
        }

    }
}