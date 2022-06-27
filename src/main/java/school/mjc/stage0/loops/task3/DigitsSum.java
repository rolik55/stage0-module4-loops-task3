package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String number = t + "";
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = t % 10;
            t /= 10;
            sum += digit;
        }
        if (sum < 0)
            sum = -sum;
        System.out.println(sum);
    }
}
