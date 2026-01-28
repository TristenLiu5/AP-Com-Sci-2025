package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int temp = 0;

        for (int i = 0; i <= input.length - 2; i++)
        {
            System.out.println(input[0] + " " + input[1] + " " + input[2] + " " + input[3]);
            for (int j = i; j <= input.length - 2; j++)
            {
                if (input[j] < temp)
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
                
            }
        }
        

    }
}
