package As1;

public class createDupeDriver {
    public static void main(String[] args){
        long start;
        long end;
        long time;
        
        start = System.currentTimeMillis();
        createDupe2 test =new createDupe2(400000, 400000);
        System.out.println(test.containsDuplicate());
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println(time);
        
    }

    
}
