import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] evenNumber = {0,12,4,16,8};//declared and initialized

        int[] oddNumber = new int[3];//declared

        oddNumber[0]=1;//init
        oddNumber[1]=3;//init
        oddNumber[2]=5;//init

        int[] firstFivePrimes = new int[]{2,3,5,7,11}; //declare and init



        System.out.println("3rd element of array is "+ evenNumber[2]);

        evenNumber[4]=20;//{0,2,4,6,20};


        Arrays.sort(evenNumber);

        System.out.println("\nEven number array elements\n");
        for (int i: evenNumber) {
            System.out.print(" "+i);
        }

        System.out.println("\nOdd number array elements\n");
        for (int j :oddNumber) {
            System.out.print(" "+ j);
        }

        System.out.println("\nPrime number array elements\n");

        for (int k: firstFivePrimes) {
            System.out.print(" "+k);
        }

    }
}