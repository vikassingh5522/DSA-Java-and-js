public class BallPuzzle {

    public static void main(String[] args) {

        // Total number of balls
        int totalBalls = 200;

        // Number of white balls (1% of 200)
        int whiteBalls = 2;

        // Calculate total balls needed for white balls to be 2%
        // whiteBalls / totalRemaining = 2 / 100
        int totalRemainingBalls = (whiteBalls * 100) / 2;

        // Red balls to remove
        int redBallsToRemove = totalBalls - totalRemainingBalls;

        // Output
        System.out.println("Red balls to remove: " + redBallsToRemove);
    }
}
