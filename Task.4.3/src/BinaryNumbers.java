public class BinaryNumbers {

    public int decimalToBinary(int dec) {
        int bin = 0;


        return bin;
    }

    public static void main(String[] args) {
        int x = -8;
        int suma = x + 3;
        x = -x;
        System.out.println(x);

        double iloraz1 = x / 4;
        double iloraz2 = x / 4.0;
//        double iloraz3 = x / 0;
        double iloraz4 = x / 0.0;
        double iloraz5 = 0 / 0.0;

        System.out.println(iloraz1);
        System.out.println(iloraz2);
//        System.out.println(iloraz3);
        System.out.println(iloraz4);
        System.out.println(iloraz5);

        int mod1 = x % 4;
        int mod2 = -x % 4;
        int mod3 = -x % -4;
        System.out.println(mod1);
        System.out.println(mod2);
        System.out.println(mod3);

        int z = 5;
        int y = z++;
        System.out.println(z);
        System.out.println(y);

        int q = 5;
        q = q++;
        System.out.println(q);


        int i1 = 1_000_000_000;
        int i2 = 2_000_000_000;
        long i3 = i1 + i2;
        System.out.println(i3);

        System.out.println(4 << 1);

//      nieskończona pętla
//        while (true) {
//
//            if (false) {
//                break;
//            }
//        }
//        System.out.println("Outside the loop");

        int tab[][] = new int[][] {
                {1,2},
                {3,4},
                {5,6}
        };

        for (int i = 0; i <tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }
        }

        for (int[] u: tab) {
            for (int elem: u) {
                System.out.println(elem);
            }
        }
    }
}
