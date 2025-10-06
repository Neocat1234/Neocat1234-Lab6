import java.util.Random;

public class TypeB extends Thing {
    private int counter = 0;

    public TypeB(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        counter++;
        if (counter % 10 == 0) { // turn every 10 steps
            int choice = rand.nextInt(3); // 0 = left, 1 = right, 2 = no turn
            if (choice == 0) leftTurn();
            else if (choice == 1) rightTurn();
        }
    }
}
