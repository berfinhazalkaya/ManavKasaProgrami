import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız ? ");
        armut = input.nextInt();

        System.out.print("Kaç kilo elma aldınız ? ");
        elma = input.nextInt();

        System.out.print("Kaç kilo domates aldınız ? ");
        domates = input.nextInt();

        System.out.print("Kaç kilo muz aldınız ? ");
        muz = input.nextInt();

        System.out.print("Kaç kilo patlıcan aldınız ? ");
        patlican = input.nextInt();

        toplam = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5.00;

        System.out.print("Toplam alışveriş tutarınız : " + toplam + "TL");

    }
}
