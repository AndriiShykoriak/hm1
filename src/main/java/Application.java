public class Application {


    public static void main(String[] args) {
        byte bbyte = -128;
        short sshort = 32766;
        long llong = 1000000;
        float ffloat =3.6f;
        double ddouble =4.67;
        long sum = bbyte + sshort;
        long sub = llong - sshort;
        double mult = ffloat * ddouble;
        double div = ddouble / ffloat;
        System.out.println("Сума:   \t" + sum );
        System.out.println("Різниця:\t" + sub);
        System.out.println("Добуток:\t" + mult);
        System.out.println("Частка: \t" + div);

    }
}
