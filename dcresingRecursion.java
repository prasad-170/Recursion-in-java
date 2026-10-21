
public class dcresingRecursion {
    public static void printDec(int a) {
        if (a == 1) {
            System.out.println(a);
            return;
        }
        System.out.print(a + " ");
        printDec(a - 1);
    }

    public static void main(String[] args) {
        int a = 10;
        printDec(a);

    }
}
