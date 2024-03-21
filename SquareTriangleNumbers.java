public class SquareTriangleNumbers {
    public static void main(String[] args) {
        int upperLimit = 1000; // Change this to adjust the upper limit

        for (int num = 1; num <= upperLimit; num++) {
            if (isSquareNumber(num) && isTriangleNumber(num)) {
                System.out.println(num + " is both square and triangle.");
            }
        }
    }

    // Function to check if a number is square
    public static boolean isSquareNumber(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to check if a number is triangle
    public static boolean isTriangleNumber(int num) {
        int sum = 0;
        int i = 1;
        while (sum < num) {
            sum += i;
            i++;
        }
        return sum == num;
    }
}
