package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");

        for (int i = 0; i <= input.length - 1; i++)
        {
            int temp = 100;

            for (int j = i; j <= input.length - 1; j++)

            if (temp > input[j])
            {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

    }
}
