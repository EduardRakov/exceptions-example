class Unchecked {
    public static void main(String[] args) {
        System.out.println("I actually don't know what i should write here");
        System.out.println("Because unchecked exceptions are so widespread");
        System.out.println("So let it be just simple division by zero");

        System.out.println("I can catch this kind of exception");
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Or not");
        int i = 1 / 0;
    }
}
