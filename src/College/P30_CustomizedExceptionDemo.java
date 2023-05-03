package College;

class ArgumentGreaterThanOne extends Exception {
    public ArgumentGreaterThanOne(String message) {
        super(message);
    }
}

public class P30_CustomizedExceptionDemo {
    public static void main(String[] args) {
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterThanOne("Only one argument allowed!");
            }
            System.out.println("Argument: " + args[0]);
        } catch (ArgumentGreaterThanOne e) {
            System.out.println(e.getMessage());
        }
    }
}

