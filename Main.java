import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin Boyutunu Giriniz : ");
        int n = scanner.nextInt();
        int[]list = new int[n];

        for(int i = 0;i < n ; i++){
            System.out.print ((i+1)+ ". Elemani : ");
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Girilen dizi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}