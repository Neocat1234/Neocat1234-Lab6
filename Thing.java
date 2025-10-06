import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int directory; // 0 = down, 1 = right, 2 = up, 3 = left
    protected char lab;

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.directory = 0; // default direction
    }

    // Abstract method for subclasses to implement their turning behavior
    public abstract void turnYes(Random random1);

    // Shared movement logic
    public void rightTurn() {
        directory = (directory + 1) % 4;
    }

    public void leftTurn() {
        directory = (directory + 3) % 4; // left turn
    }

    public void step() {
        final int[] x = {0, 1, 0, -1};
        final int[] y = {1, 0, -1, 0};
        row += y[directory];
        col += x[directory];
    }

    // Optional: getter for position for printing
    public String retrive() {
        return "(" + row + "," + col + ")";
    }
}