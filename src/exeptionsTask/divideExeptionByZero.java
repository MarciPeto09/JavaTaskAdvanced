package exeptionsTask;

public class divideExeptionByZero {
    public static void main(String[] args) throws Exception {

        try {
            divideByZero(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Nuk mund te pjestosh me 0!");
        }
    }

    public static int divideByZero(int x, int y) {
        if(y == 0){
            throw new ArithmeticException("Pjestim me zero!");
        }
        int z = x / y;
        return z;
    }
}

