package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {

        first = 0;
        second = 4;
        third = 3;

        if(first > second && first > third){
            System.out.println(first + " is greater");
        } else if(second > first && second > third){
            System.out.println(second + " is greater");
        } else {
            System.out.println(third + " is greater");
        }
    }
    
    public static void main(String[] args){
        printGreatest(0);
    }

    private static void printGreatest(int i) {
    }

}
