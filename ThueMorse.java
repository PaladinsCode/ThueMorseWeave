public class ThueMorse{
    public static void main(String[] args) {
        // Command line argument
        int n = Integer.parseInt(args[0]);

        // Setting array size
        int[] thueMorse = new int[10000];

        // Constructiono ThueMorse Array
        for (double span = 0, k = 0; k <= n && span < 300; span = Math.pow(2.0,(double) k), k++) {
            for (int i = 0; i < span / 2; i++) {
                if (thueMorse[i] == 0) {
                    thueMorse[(int) (i + Math.round(span/2))] = 1;
                }
                else {
                    thueMorse[(int) (i + span/2)] = 0;
                }
            }
        }

        // Print the desired pattern
        for (int line = 0; line < n; line ++) {
            for (int cell = 0; cell < n; cell++) {
                if (thueMorse[cell] == thueMorse[line]) {
                    System.out.print("+  ");
                }
                else
                {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
