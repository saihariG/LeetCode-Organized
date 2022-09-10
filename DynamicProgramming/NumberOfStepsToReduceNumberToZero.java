package DynamicProgramming;

public class NumberOfStepsToReduceNumberToZero {
    private int steps;

    public int numberOfSteps(int num) {
        if(num == 0) {
            return steps;
        }

        if(num % 2 == 0) {
            numberOfSteps(num / 2);
        }
        else {
            numberOfSteps(num -1);
        }
        steps++;

        return steps;
    }
}
