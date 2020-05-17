public class AsteriksProblem {

    public static void main(String[] args) {
        int maxlimit = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= maxlimit; j++) {
                System.out.print("*");
            }
            if (i + 1 >= 5) {
                maxlimit--;
            } else {
                maxlimit++;
            }
            System.out.println();
        }
    }
}
