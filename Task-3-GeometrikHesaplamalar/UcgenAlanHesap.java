public class UcgenAlanHesap {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Kenar 1: " + a);
        System.out.println("Kenar 2: " + b);
        System.out.println("Kenar 3: " + c);
        System.out.println("Ucgenin Alani: " + A);
    }
}
