package As1;

import java.util.Arrays;

public class createDupe3 extends Duplication {

    public createDupe3(int arraySizeIn, int maxValueIn) {
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate() {
       boolean dupeFound = false;
       int[] newArr = Arrays.copyOf(super.array, super.array.length);
       Arrays.sort(newArr);
       for (int i=0;i+1<newArr.length;i++){
        if (newArr[i] == newArr[i+1]){
            dupeFound =true;
            break;
        }
       }
       return dupeFound;
    }
    
    
}