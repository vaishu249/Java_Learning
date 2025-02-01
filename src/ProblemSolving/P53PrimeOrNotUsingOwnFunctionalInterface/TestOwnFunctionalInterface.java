package ProblemSolving.P53PrimeOrNotUsingOwnFunctionalInterface;

public class TestOwnFunctionalInterface {
    public static void main(String[] args) {
        Candidate candidate = num -> {
             // Edge case for numbers < 2
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(12));
        System.out.println(candidate.isCandidate(7));
    }
}
