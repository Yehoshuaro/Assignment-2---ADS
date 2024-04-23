import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] shelf = new int[2 * N];
        int left = N - 1, right = N;

        for (int i = 0; i < N; i++) {
            int operation = scanner.nextInt();

            if (operation == 1 || operation == 2){
                int diskNumber = scanner.nextInt();
                if (operation == 1) {
                    shelf[left--] = diskNumber;
                } else {
                    shelf[right++] = diskNumber;
                }
            }
            else{
                if (operation == 3) {
                    System.out.print(shelf[++left] + " ");
                } else {
                    System.out.print(shelf[--right] + " ");
                }
            }
        }
        scanner.close();
    }
}


