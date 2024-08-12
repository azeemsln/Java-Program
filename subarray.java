public class subarray {
    public static void subarr(int number[]) {
        int ts = 0;
        int subarry[] = new int[15];
        int x = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j, l = 0;
                int k;
                for (k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    l = l + number[k];
                }
                subarry[x] = l;
                x++;
                System.out.println();
                ts++;
            }

        }
        int z = subarry[0];

        System.out.println("Total number of subarray is " + ts);
        for (int m = 0; m < 15; m++) {
            if (subarry[m] > z) {
                z = subarry[m];
            }
        }
        System.out.println(z);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        subarr(number);
    }
}