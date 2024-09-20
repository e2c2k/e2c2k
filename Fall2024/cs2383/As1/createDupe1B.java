package As1;

public class createDupe1B extends Duplication {

    public createDupe1B(int arraySizeIn, int maxValueIn) {
        super(arraySizeIn, maxValueIn);
    }

    @Override
    public boolean containsDuplicate() {
       boolean dupeFound = false;
       int length = super.array.length;
       for (int i =0;i<length;i++){
        for (int j = i+1; j<length;j++){
            if (super.array[i] == super.array[j]){
                dupeFound = true;
            }
        }
    }
       return dupeFound;
    }
    
    
}
