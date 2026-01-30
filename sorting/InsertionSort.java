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
                temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
                
            

                for (int j = i; j >= 0; j--)
                {
                
                if (input[j] > key)
                {
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
               }
               
            }
            }
                
            }
            
        }
        

    }

