import java.util.Scanner;

public class DersOrtalamasi {
    public static void main(String[] args) {

        int[] dersNotlari = new int[6];
        String[] dersler = { "Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik" };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print(dersler[i] + " notu: ");
            dersNotlari[i] = scanner.nextInt();
        }

        int toplam = 0;
        for (int dersNotu : dersNotlari) {
            toplam += dersNotu;
        }

        double ortalama = (double) toplam / dersNotlari.length;

        String durumu = ortalama > 60 ? "Geçtiniz" : "Kaldınız";


        System.out.println("Ortalamanız = " + ortalama + " "+ durumu);

        scanner.close();
    }
}