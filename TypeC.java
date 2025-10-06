import java.util.Random;

public class TypeC extends Thing {
    private boolean toggle = true; // switch between left and right

    public TypeC(int row, int col, char lab) {
        super(row, col, lab);
    }

    @Override
    public void maybeTurn(Random rand) {
        // Zig-zag: alternate left and right every step
        if (toggle) {
            leftTurn();
        } else {
            rightTurn();
        }
        toggle = !toggle;
    }
}