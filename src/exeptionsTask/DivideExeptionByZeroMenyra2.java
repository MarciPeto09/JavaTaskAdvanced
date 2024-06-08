package exeptionsTask;

public class DivideExeptionByZeroMenyra2 {
    public static void main(String[] args) throws divideBy0 {

        pjestimeMe0(3, 0);
    }

    class divideBy0 extends Exception {
        public divideBy0() {
            super("Mos pjesto me zero!");
        }
    }

    public static int pjestimeMe0(int x, int y) throws divideBy0 {
        if (y == 0) {
            System.out.println("Nuk mund te pjestosh me zero!");
        }

        return x / y;
    }
}

