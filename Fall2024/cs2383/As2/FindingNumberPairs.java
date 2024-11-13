public class FindingNumberPairs {
    public static int[] findPair(int[] array, int target){
        return findPairHelper(array, target,0);
    }
    /*first recursive method that takes the first index which is 0 and calls the second recursive method 
     * which tries to find a seperate index which adds with the first to equal the target
     * if no second index is found this first method is called again with an updated first
     * index, then calls the second again to try and find a second index. and so on.
     */
    private static int[] findPairHelper(int[] array, int target, int index) {
        if (index >= array.length - 1) {
            return null;
        }
        int[] second = findSecond(array, target - array[index], index, index + 1);
        
        if (second != null) {
            return new int[] { index, second[0] };
        }
        return findPairHelper(array, target, index + 1);
    }
    /*this is the second recursive method which takes the target - the first index and tries to
     * find a another index which equals the leftover target number. repeats until an index is found
     * or all indexes have been checked. 
     */
    private  static int[] findSecond(int[] array, int target, int index, int next) {
        if (next >= array.length) {
            return null;
        }
        if (array[next] == target) {
            return new int[] { next };
        }
        return findSecond(array, target, index, next + 1);
    }

    public static int[] findPairSorted(int[] array,int target){
        return sortedHelper(array,0,9,target);

    }
    /*starts at the left most and the right most indexes of the array
     * if the sum of the two is greater then the target then the right most index is subracted
     * if the sum of the two is less then the target then the left mosty index is incremented 
     * until the target is found or the left and right index have met.
     */
    private static int[] sortedHelper(int[] array,int left,int right,int target){
        if(left>=right){
            return null;
        }

        if(array[left]+array[right]>target){
            return sortedHelper(array,left,right-1,target);
        }else if(array[left]+array[right]<target){
            return sortedHelper(array,left+1,right,target);
        }

        return new int[] {left,right};

    }

    public static void main (String[] args){
        int[] array1 = { 0, 5, 7, 1, 2, 9, 16, 8, 6, 11 };
        System.out.print("First Array: ");
        for(int i: array1){
            System.out.print(i+" ");
        }
        int target1 = 10;
        System.out.println("\nTarget: "+ target1);
        int[] result1 = findPair(array1, target1);
        for(int i:result1){
            System.out.print("index: " + i +" ");
        }

        int[] array2 = { 10, 15, 17, 11, 12, 19, 16, 18, 16, 11 };
        System.out.print("\n\nSecond Array: ");
        for(int i: array2){
            System.out.print(i+" ");
        }
        int target2 = 10;
        System.out.println("\nTarget: "+ target2);
        int[] result2 = findPair(array2, target2);
        if(result2 == null){
            System.out.println("result2 is null");
        }else{
            for(int i:result2){
                System.out.print("index: " + i +" ");
            }
        }

        int[] array3 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        System.out.print("\n\nThrid Array: ");
        for(int i: array3){
            System.out.print(i+" ");
        }
        int target3 = 33;
        System.out.println("\nTarget: "+ target3);
        int[] result3 = findPair(array3, target3);
        if(result3 == null){
            System.out.println("result3 is null");
        }else{
            for(int i:result3){
                System.out.print("index: " + i +" ");
            }
        }

        int[] array4 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        System.out.print("\n\nFourth Array: ");
        for(int i: array4){
            System.out.print(i+" ");
        }
        int target4 = 1;
        System.out.println("\nTarget: "+ target4);
        int[] result4 = findPair(array4, target4);
        if(result4 == null){
            System.out.println("result4 is null");
        }else{
            for(int i:result4){
                System.out.print("index: " + i +" ");
            }
        }

    }
}
