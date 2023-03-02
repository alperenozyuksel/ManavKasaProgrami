import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican;

        System.out.print("Aldiginiz Armut Kilogramini Giriniz : ");
        armut = input.nextDouble();

        System.out.print("Aldiginiz Elma Kilogramini Giriniz : ");
        elma = input.nextDouble();

        System.out.print("Aldiginiz Domates Kilogramini Giriniz : ");
        domates = input.nextDouble();

        System.out.print("Aldiginiz Muz Miktarini Giriniz : ");
        muz = input.nextDouble();

        System.out.print("Aldiginiz Patlican Kilogramini Giriniz : ");
        patlican = input.nextDouble();

        double armutfiyat = 2.14;
        double elmafiyat = 3.67;
        double domatesfiyat = 1.11;
        double muzfiyat = 0.95;
        double patlicanfiyat = 5.00;

        double toplam = armut*armutfiyat + elma*elmafiyat + domates*domatesfiyat + muz*muzfiyat + patlican*patlicanfiyat;

        System.out.print(toplam);





    }
}
