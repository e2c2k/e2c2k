package As1;

public class createDupe1A extends Duplication{
    
    public createDupe1A(int arraySizeIn, int maxValueIn){
        super(arraySizeIn , maxValueIn);
    }

    public boolean containsDuplicate() {
        int length = array.length;
        for (int i =0;i<length;i++){
            for (int j = i+1; j<length;j++){
                if (array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
    
}
