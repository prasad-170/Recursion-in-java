public class incresingRecursion {
    public static void printAdd(int a) {
        if (a == 10) {
            System.out.println(a);
            return;
        }
        System.out.print(a + " ");
        printAdd(a + 1);
    }

    public static void main(String[] args) {
        int a = 1;
        printAdd(a);

    }
}
