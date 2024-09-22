package As1;


public class createDupe4 extends Duplication {

    public createDupe4(int arraySizeIn, int maxValueIn) {
        super(arraySizeIn, maxValueIn);
    }

    public boolean containsDuplicate() {
       boolean dupeFound = false;
       BinaryTree tree = new BinaryTree();
       for (int value :array)
        try{
            tree.insert(value);
        }catch(IllegalArgumentException e){
            dupeFound= true;
            return dupeFound;
        }
       return dupeFound;
    }
    
    
}
