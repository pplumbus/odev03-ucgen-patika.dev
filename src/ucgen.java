import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {

        double ilkuzun, ikinciuzun, kisa;


        Scanner girdi = new Scanner(System.in);
        System.out.println("Birinci Uzun Kenari Giriniz: ");
        ilkuzun = girdi.nextInt();
        System.out.println("Ikıncı Uzun Kenari Giriniz: ");
        ikinciuzun = girdi.nextInt();
        System.out.println("Kisa Kenari Giriniz: ");
        kisa = girdi.nextInt();

        double u = (ilkuzun + ikinciuzun + kisa) / 2;
        double cevre = 2 * u;
        double alan = u * (u - ilkuzun) * (u - ikinciuzun) * (u - kisa);

        System.out.println("u : " + u);
        System.out.println("Cevre : " + cevre);
        System.out.println("Alan : " + alan);

    }
}

