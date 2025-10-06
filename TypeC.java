import java.util.Random;

public class TypeC extends Thing {
    private boolean switch1 = true; // boolean switch 

    public TypeC(int row, int col, char x) {
        super(row, col, x);
    }

    @Override
    public void turnYes(Random radom1) {
        
        if (switch1) {
            leftTurn();
        } else {
            rightTurn();
        }
        switch1 = !(switch1);
    }
}