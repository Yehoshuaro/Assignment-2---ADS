import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[][] elements = new Object[100][100];

        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            int numElements = scanner.nextInt();
            for (int j = 0; j < numElements; j++) {
                elements[i][j] = scanner.nextInt();
            }
        }
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            int rowIndex = scanner.nextInt() - 1;
            int elementIndex = scanner.nextInt() - 1;

            if (rowIndex >= 0 && rowIndex < rows &&
                    elementIndex >= 0 && elementIndex < elements[rowIndex].length) {
                System.out.println (elements [rowIndex][elementIndex] );
            }
            else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
