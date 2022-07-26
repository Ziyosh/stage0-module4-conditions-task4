package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        first = 12;
        second = -400;
        
        int great = first > second ? first : second;
        System.out.println(great);
    }
    
    public static void main(String[] args){
        printGreatest(12);
    }

    private static void printGreatest(int i) {
    }
}
