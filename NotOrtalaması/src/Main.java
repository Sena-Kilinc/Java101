import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişken oluşturuldu
        int mat,fizik,kimya,turkce,tarih,muzik;
        //scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
        //kullanıcdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        double sonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamanız: " + sonuc);

        System.out.println(sonuc>60? "Sınıfı geçti":"Sınıfta Kaldı");
    }
}
