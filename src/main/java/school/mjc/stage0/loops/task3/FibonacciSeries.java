package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int[] sequence = new int[lastFibonacci];
        sequence[0] = 0;
        sequence[1] = 1;
        System.out.println(sequence[0]);
        System.out.println(sequence[1]);
        for (int i = 2; i < lastFibonacci; i++) {
            sequence[i] = sequence[i - 2] + sequence[i - 1];
            System.out.println(sequence[i]);
        }
    }
}
