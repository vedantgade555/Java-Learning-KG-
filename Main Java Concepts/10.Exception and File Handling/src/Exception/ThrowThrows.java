package Exception;

class ThrowThrowsExample {

    // Method declares that it may throw an exception
    static void checkMarks(int marks) throws ArithmeticException {
        if (marks < 40) {
            // Actually throwing an exception
            throw new ArithmeticException("Failed — marks below passing score!");
        } else {
            System.out.println("Passed the exam!");
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(35);  // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}

