package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {

        first = -10;
        second = 10;

        int i = first > second ? first : second;
        System.out.println(second);
    }
    
    public static void main(String[] args){
        assignAndPrintBasedOnWhichBigger((int) 10);
    }

    private static void assignAndPrintBasedOnWhichBigger(int i){

    }





}
