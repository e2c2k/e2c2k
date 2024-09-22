package As1;

public class createDupe1B extends Duplication {

    public createDupe1B(int arraySizeIn, int maxValueIn) {
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate() {
       boolean dupeFound = false;
       int length = array.length;
       for (int i =0;i<length;i++){
        for (int j = i+1; j<length;j++){
            if (array[i] == array[j]){
                dupeFound = true;
            }
        }
    }
       return dupeFound;
    }
    
    
}
