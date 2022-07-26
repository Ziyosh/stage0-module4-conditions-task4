package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        first = 1;
        second = 2;
        third = 3;

        int max = (first > second && first > third) ?
                first : (second > first && third > second) ?
                second : third;
        System.out.println(max);
    }
    public static void main(String[] args){
        printGreatest(3);
    }

    private static void printGreatest(int i) {
    }
}
