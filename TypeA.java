import java.util.Random;

public class TypeA extends Thing {

    public TypeA(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        int choice = rand.nextInt(3); // 0 = left, 1 = right, 2 = no turn
        if (choice == 0) leftTurn();
        else if (choice == 1) rightTurn();
    }
}