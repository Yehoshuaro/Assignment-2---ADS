import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numElements = sc.nextInt();
        int[] numbers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            numbers[i] = sc.nextInt();
        }
        int numQueries = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numQueries; i++) {
            String queryType = sc.nextLine();
            if (queryType.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                numbers = insert(numbers, index, value);
            }
            else {
                int removeIndex = sc.nextInt();
                numbers = remove(numbers, removeIndex);
            }
            sc.nextLine();
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] insert(int[] arr, int index, int value) throws Exception {
        if (index < 0 || index > arr.length) {
            throw new Exception("Invalid insertion index");
        }

        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);

        newArr[index] = value;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

        return newArr;
    }
    public static int[] remove(int[] arr, int index) throws Exception {
        if (index < 0 || index >= arr.length) {
            throw new Exception("Invalid removal index");
        }

        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);

        return newArr;
    }
}

