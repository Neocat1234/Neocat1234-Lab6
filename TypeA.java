import java.util.Random;

public class TypeA extends Thing {

    public TypeA(int row, int col, char x) {
        super(row, col, x);
    }

    @Override
    public void maybeTurn(Random random1) {
        int y = random1.nextInt(3); 
        if (y == 0) leftTurn();
        else if (y == 1) rightTurn();
    }
}