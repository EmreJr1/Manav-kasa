import java.util.Scanner;

public class Manav_kasa_programi {
    public static void main(String[] args) {
        /*kullanıcıdan alacağımız kg değerlerini tanımlıyoruz*/
        int kgArmut ,kgElma, kgDomates , kgMuz, kgPatlıcan ;
        /* sabit kilogram değerlerini tanımlıyoruz*/
        double Armut=2.14 , Elma=3.17 ,Domates=1.11 ,Muz=0.95, Patlıcan = 5.0;
        /*kullanıcıdan veri alma*/
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo= ");
        kgArmut = input.nextInt();
        System.out.print("Elma Kaç Kilo= ");
        kgElma = input.nextInt();
        System.out.print("Domates Kaç Kilo= ");
        kgDomates = input.nextInt();
        System.out.print("Muz Kaç Kilo= ");
        kgMuz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo= ");
        kgPatlıcan = input.nextInt();
        /*kullanıcıya çıktı ekrnıyla kilogram fiyatlarını gösterme*/
        System.out.println("Armut fiyat ="+Armut*kgArmut);
        System.out.println("Elma fiyat ="+Elma*kgElma);
        System.out.println("Domates fiyat ="+Domates*kgDomates);
        System.out.println("Muz fiyat ="+Muz*kgMuz);
        System.out.println("Patlıcan fiyat ="+Patlıcan*kgPatlıcan);

        System.out.println("Toplam Fiyat ="+((Patlıcan*kgPatlıcan)+(Muz*kgMuz)+(Domates*kgDomates)+(Elma*kgElma)+(Armut*kgArmut)));

    }
}
