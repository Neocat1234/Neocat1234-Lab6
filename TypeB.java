import java.util.Random;

public class TypeB extends Thing {
    private int count = 0;

    public TypeB(int row, int col, char x) {
        super(row, col, x);
    }

    @Override
    public void turnYes(Random random1) {
        count++;
        if (count % 10 == 0) { // turn every 10 steps
            int des = random1.nextInt(3); // 0 = left, 1 = right, 2 = no turn
            if (des == 0) leftTurn();
            else if (des == 1) rightTurn();
        }
    }
}