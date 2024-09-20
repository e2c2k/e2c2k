package As1;

public class createDupe2 extends Duplication {

    public createDupe2(int arraySizeIn, int maxValueIn) {
        super(arraySizeIn, maxValueIn);
    }

    @Override
    public boolean containsDuplicate() {
       boolean dupeFound = false;
       int[] lookUP = new int[super.maxValue +1];
       for (int i =0;i<super.arraySize;i++){
        if (lookUP[super.array[i]] == 1){
            dupeFound = true;
            break;
        }else{
            lookUP[super.array[i]] = 1;
        }
       }
       return dupeFound;
    }
    
    
}