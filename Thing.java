import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir; // 0 = down, 1 = right, 2 = up, 3 = left
    protected char lab;

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0; // default direction
    }

    // Abstract method for subclasses to implement their turning behavior
    public abstract void maybeTurn(Random rand);

    // Shared movement logic
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4; // left turn
    }

    public void step() {
        final int[] dc = {0, 1, 0, -1};
        final int[] dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    // Optional: getter for position for printing
    public String getPosition() {
        return "(" + row + "," + col + ")";
    }
}