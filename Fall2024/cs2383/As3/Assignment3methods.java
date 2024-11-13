package As3;
import java.util.Random;
public class Assignment3methods {
    public static int[] fillArray(int n){
        Random rand = new Random();
        int[] result = new int[n-1];
        int exclude = rand.nextInt(n);

        int index =0;
        for (int i=0;i<n;i++){
            if (i !=exclude){
                result[index]=i;
                index++;
            }
        }

        for (int i = result.length -1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;

        }
        return result;
    }

    public static int findMissingNumber(int[] array){
        int full = (array.length+1) * (array.length) / 2;
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return full - sum;
    }

    public static void main (String args[]){
       int[] test= fillArray(20);
        System.out.print("array: ");
       for(int i = 0; i< test.length;i++){
        System.out.print(test[i]+" ");

       }

       System.out.println("\nMissing Number: " +findMissingNumber(test));

    }
}
