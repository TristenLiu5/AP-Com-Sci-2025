package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int temp = 0;

        for (int i = 0; i <= input.length - 2; i++)
        {
            for (int j = i; j <= input.length - 2; j++)
            {
                if (input[j] > temp)
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        
        }
        System.out.println(input);

    }
}
