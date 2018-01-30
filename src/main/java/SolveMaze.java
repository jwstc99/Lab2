import edu.illinois.cs.cs125.lib.mazemaker.Maze;
import java.lang.Math;

/**
 * Solve a randomly-generated maze.
 *
 * @see <a href="https://github.com/cs125-illinois/mazemaker">Mazemaker on GitHub</a>
 * @see <a href="https://cs125-illinois.github.io/mazemaker/">Mazemaker Documentation</a>
 * @see <a href="https://cs125.cs.illinois.edu/lab/2/#maze">Lab 2 Writeup</a>
 */
@SuppressWarnings("checkstyle:emptyblock")
public class SolveMaze {

    /**
     * Implement your maze solving algorithm in the main method below.
     *
     * @param unused unused input arguments
     */

    public static void main(final String[] unused) {
        /*
         * Create a new 10 x 10 maze. Feel free to change these values.
         */
        Maze maze = new Maze(10, 10);

        /*
         * Pick (0, 0), the bottom left corner, as the starting point.
         * Put the end in the top right corner.
         */
        maze.startAtZero();
        maze.endAtTopRight();

        /*
         * You should be able to solve a 10 x 10 maze in (far fewer than) 1000 steps.
         * Feel free to adjust this number if you experiment with other mazes.
         */
        for (int step = 0; step < 100000; step++) {
            // Implement your maze solving algorithm here
            System.out.println(step);
            if (maze.isFinished()) {
                break;
            }
            /* maze.turnRight();
            if (maze.canMove()) {
                maze.move();
                continue;
            } else {
                maze.turnLeft();
            }
            if (maze.canMove()) {
                maze.move();
                continue;
            } else {
                maze.turnLeft();
            }
            if (maze.canMove()) {
                maze.move();
                continue;
            } else {
                maze.turnLeft();
                maze.move();
            }
        }*/
            int random = ((int) (Math.random() * 100)) % 4;
            if (random == 0) {
                maze.move();
            }
            if (random == 1) {
                maze.turnLeft();
                maze.move();
            }
            if (random == 2) {
                maze.turnRight();
                maze.move();
            }
            if (random == 3) {
                maze.turnRight();
                maze.turnRight();
                maze.move();
            }
        }
        if (maze.isFinished()) {
            System.out.println("You solved the maze!");
        } else {
            System.out.println("Try again!");
        }
    }
}
