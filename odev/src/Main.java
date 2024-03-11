import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Lisansogrencı lısans= new Lisansogrencı();
        Yukseklisansogrencı yuksek=new Yukseklisansogrencı();
        Doktoraogrencı doktor= new Doktoraogrencı();

        for (int i = 0; i <1 ; i++) {
            System.out.println("Lisans Öğrencisi Bilgileri");
            System.out.print("Ad: ");
            lısans.ad= scn.nextLine();
            System.out.print("Soyad: ");
            lısans.soyad= scn.nextLine();
            System.out.print("Numara: ");
            lısans.numara= scn.nextDouble();
            scn.nextLine();
            System.out.print("Bölüm: ");
            lısans.bolum= scn.nextLine();
            System.out.print("Btirme: ");
            lısans.bitirme=scn.nextLine();
            System.out.println(" ");
        }
        for (int i = 0; i <1 ; i++) {
            System.out.println("Yükseklisans Öğrenci bilgileri");
            System.out.print("Ad: ");
            yuksek.ad= scn.nextLine();
            System.out.print("Soyad: ");
            yuksek.soyad= scn.nextLine();
            System.out.print("Numara: ");
            yuksek.numara= scn.nextDouble();
            scn.nextLine();
            System.out.print("Bölüm: ");
            yuksek.bolum= scn.nextLine();
            System.out.print("Tez konusu: ");
            yuksek.tezkonsu=scn.nextLine();
            System.out.print("Danışman: ");
            yuksek.danışman=scn.nextLine();
            System.out.println(" ");
        }
        for (int i = 0; i <1 ; i++) {
            System.out.println("Doktora öğrenci bilgileri");
            System.out.print("Ad: ");
            doktor.ad= scn.nextLine();
            System.out.print("Soyad: ");
            doktor.soyad= scn.nextLine();
            System.out.print("Numara: ");
            doktor.numara= scn.nextDouble();
            scn.nextLine();
            System.out.print("Bölüm: ");
            doktor.bolum= scn.nextLine();
            System.out.print("Tez konusu: ");
            doktor.tezkonusu=scn.nextLine();
            System.out.print("Danışman: ");
            doktor.danışman=scn.nextLine();
            System.out.print("yeterlilik: (true/false) ");
            doktor.yeterlilik=scn.nextBoolean();
            System.out.println(" ");
        }
        for (int i = 0; i <1 ; i++) {
            System.out.println("Lisans Öğrenci Bilgileri");
            System.out.println("ad:"+lısans.ad+"   "+"soyad:"+lısans.soyad+"   "+"numara:"+lısans.numara+"   "+"bölüm:"+lısans.bolum+"   "+"bitirme:"+lısans.bitirme);
            System.out.println("Yğkseklisans Öğreci bilgileri");
            System.out.println("ad:"+yuksek.ad+"   "+"soyad:"+yuksek.soyad+"   "+"numara:"+yuksek.numara+"   "+"bölüm:"+yuksek.bolum+"   "+"tezkonusu:"+yuksek.tezkonsu+"   "+"danışman:"+yuksek.danışman );
            System.out.println("Doktora Öğrenci bilgileri");
            System.out.println("ad:"+doktor.ad+"   "+"soyad:"+doktor.soyad+"   "+"numara:"+doktor.numara+"   "+"bölüm:"+doktor.bolum+"   "+"tezkonusu:"+doktor.tezkonusu+"   "+"danışman:"+doktor.danışman+"   "+"yeterlilik:"+doktor.geç(doktor.yeterlilik));
        }

    }
}