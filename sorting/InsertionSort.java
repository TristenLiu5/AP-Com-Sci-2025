package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int temp;

        for (int i = 0; i <= input.length - 2; i++)
        {

            int key = input[i + 1];

            if (input[i] > key)
            {
                

            for (int j = i; j <= input.length - 2; j++)
            {
                System.out.println(input[0] + " " + input[1] + " " + input[2] + " " + input[3]);
                

                if (input[j] > key)
                {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
                
            }
            }
        }
        

    }
}
