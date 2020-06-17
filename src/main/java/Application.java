public class Application {

    public static void main(String[] args) {
        byte bByte = -128;
        short sShort = 32766;
        long lLong = 1000000;
        float fFloat = 3.6f;
        double dDouble = 4.67;
        long sum = bByte + sShort;
        long sub = lLong - sShort;
        double mult = fFloat * dDouble;
        double div = dDouble / fFloat;
        System.out.println("Sum:           \t" + sum);
        System.out.println("Difference:    \t" + sub);
        System.out.println("Multiplication:\t" + mult);
        System.out.println("Division:      \t" + div);
    }
}
