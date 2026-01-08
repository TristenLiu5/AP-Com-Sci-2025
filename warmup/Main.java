package warmup;

public class Main {

    public static void main(String[] args) {
        // Your code here

        int number = 0;
        System.out.println(number);

        for (int i = 0; i <= 1000; i++)
        {
            if (i%3 == 0)
            {
                number += i;
                System.out.println(number);
            }
            else if (i%5 == 0)
            {
                number += i;
                System.out.println(number);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();

            int first = 0;
            int second = 1;
            int third = second;
            int sum = 0;

            while ((second <= 4000000 && first <= 4000000))
            {
                third = second;
                second = first + second; //1
                first = third;
                System.out.println(first + "," + second);

                if (second % 2 == 0)
                {
                    sum += second;
                    System.out.println(sum);
                }
            }
    }



}
