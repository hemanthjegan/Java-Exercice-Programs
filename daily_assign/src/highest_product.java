// Java program to find maximum product by breaking
// the Integer

class highest_product {
    // method return x^a in log(a) time
    static int power(int x, int a)
    {
        int res = 1;
        while (a > 0) {
            if ((a & 1) > 0)
                res = res * x;
            x = x * x;
            a >>= 1;
        }
        return res;
    }

    // Method returns maximum product obtained by
    // breaking N
    static int breakInteger(int N)
    {
        // base case 2 = 1 + 1
        if (N == 2)
            return 1;

        // base case 3 = 2 + 1
        if (N == 3)
            return 2;

        int maxProduct = -1;

        // breaking based on mod with 3
        switch (N % 3) {
            // If divides evenly, then break into all 3
            case 0:
                maxProduct = power(3, N / 3);
                break;

            // If division gives mod as 1, then break as
            // 4 + power of 3 for remaining part
            case 1:
                maxProduct = 2 * 2 * power(3, (N / 3) - 1);
                break;

            // If division gives mod as 2, then break as
            // 2 + power of 3 for remaining part
            case 2:
                maxProduct = 2 * power(3, N / 3);
                break;
        }
        return maxProduct;
    }

    // Driver code to test above methods
    public static void main(String[] args)
    {
        int maxProduct = breakInteger(10);
        System.out.println(maxProduct);
    }
}


//Question

//Given a number N, the task is to split the Num into multiple parts
//        in such a fashion as to find the highest product. Print the highest product
//        value.
//        Consider N = 4.
//        Best: 4 = 2 + 2 and 2 * 2 = 4
//        Similarly for N = 6, (3 * 3) = 9
//        For N = 8, (2 * 3 * 3) = 18
//        For N = 15, (3 * 3 * 3 * 3 * 3) = 243
//        Constraints
//        1 <= N <= 100
//        Input format
//        The candidate has to write the code to accept a non-negative integer
//        number only.
//        Output format
//        The output should be a positive integer only.
//        Example 1
//        Input
//        4
//        Output
//        4
//        Example 2
//        Input
//        6
//        Output
//        9


// method 2

//public class highest_product
//{
//    /* The main function that returns the max possible product */
//    static int maxProd(int n)
//    {
//
//        // n equals to 2 or 3 must be handled explicitly
//        if (n == 2 || n == 3) return (n - 1);
//
//        // Keep removing parts of size 3 while n is greater than 4
//        int res = 1;
//        while (n > 4)
//        {
//            n -= 3;
//            res *= 3; // Keep multiplying 3 to res
//        }
//        return (n * res); // The last part multiplied by previous parts
//    }
//
//    // Driver code
//    public static void main(String[] args) {
//        System.out.println("Maximum Product is " + maxProd(45));
//    }
//}
