package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String str = t + "";
        int result = 0;
        int power = 1;
        for (int i = 0; i < str.length(); i++) {
            result += (t / power) % 10;
            power *= 10;

        }

        System.out.println(Math.abs(result));
    }
}
