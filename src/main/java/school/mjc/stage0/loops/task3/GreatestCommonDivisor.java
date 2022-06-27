package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        if (first == 0 || second == 0)
            gcd = first > second ? first : second;
        for (int i = 1; i <= first && i <= second; i++)
            if (first % i == 0 && second % i == 0)
                gcd = i;
        System.out.println(gcd);
    }
}
