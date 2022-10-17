import java.util.Scanner;
public class maxMin {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int n = 1, min, max;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int adet = input.nextInt();

        System.out.print(n + ". Sayıyı giriniz : ");
        int sayi = input.nextInt();
        max = sayi;
        min = sayi;
        n++;

        while (adet - 1 > 0) {
            System.out.print(n + ". Sayıyı giriniz : ");
            sayi = input.nextInt();
            n++;
            if (sayi > max) {
                max = sayi;
            }
            else if (sayi < min) {
                min = sayi;
            }
            adet--;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}