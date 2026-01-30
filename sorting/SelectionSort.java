package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");

        for (int i = 0; i <= input.length; i++)
        {
            int temp = 100;
            int storage = 0;

            for (int j = i; j <= input.length - 1; j++)
            {
            if (temp > input[j])
            {
                temp = input[j];
                storage = j;
            }
            
            if (j == input.length - 1)
            {
                input[storage] = input[i];
                input[i] = temp;
            }
            //System.out.println(input[0] + " " +input[1] + " " + input[2] + " " + input[3] + " " + input[4]);
        }

    }
    }
}