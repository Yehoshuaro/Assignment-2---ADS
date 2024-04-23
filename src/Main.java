import java.util.Scanner;

public class Main {
    public static Integer[] maxHeapify(Integer[] array, Integer i) {
        Integer leftChild = 2 * i + 1; // it's a left potok
        Integer rightChild = 2 * i + 2; // this is right potok

        Integer maxIndex = i;
        if (leftChild < array.length && array[leftChild] > array[maxIndex])
            maxIndex = leftChild;
        if (rightChild < array.length && array[rightChild] > array[maxIndex])
            maxIndex = rightChild;

        if (maxIndex != i) {
            Integer temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;

            array = maxHeapify(array, maxIndex);
        }
        return array;
    }
    public static Integer[] buildMaxHeap(Integer[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            array = maxHeapify(array, i);
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size:");
        int size = scanner.nextInt();
        Integer[] initialArray = new Integer[size];

        System.out.println("");
        for (int i = 0; i < size; i++) {
            initialArray[i] = scanner.nextInt();
        }
        Integer[] maxHeapArray = buildMaxHeap(initialArray);

        System.out.println("Max Heap Array:");
        for (Integer value : maxHeapArray) {
            System.out.println(value);
        }
        System.out.println("\nHeap Structure:");
        for (int i = 0; i < maxHeapArray.length / 2; i++) {
            Integer parent = maxHeapArray[i];
            Integer leftChild = (2 * i) + 1 < maxHeapArray.length ? maxHeapArray[(2 * i) + 1] : null;
            Integer rightChild = (2 * i) + 2 < maxHeapArray.length ? maxHeapArray[(2 * i) + 2] : null;

            System.out.println("Parent: " + parent + ", Left Child: " + leftChild + ", Right Child: " + rightChild);
        }
    }
}
