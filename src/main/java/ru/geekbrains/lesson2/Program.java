package ru.geekbrains.lesson2;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        int[] array1 = ArrayUtils.prepareArray(10);

        ArrayUtils.printArray(array1);
        HeapSort.sort(array1);
        ArrayUtils.printArray(array1);

        int[] array = ArrayUtils.prepareArray(100000);

        long startTime = System.currentTimeMillis();
        SortUtils.directSort(array.clone());
        long endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения сортировки выбором: %d мс.\n", endTime - startTime);


        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения быстрой сортировки: %d мс.\n", endTime - startTime);


        startTime = System.currentTimeMillis();
        Arrays.sort(array.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения системной сортировки: %d мс.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        HeapSort.sort(array.clone());
        endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения пирамидальной сортировки сортировки: %d мс.\n", endTime - startTime);


    }

}
