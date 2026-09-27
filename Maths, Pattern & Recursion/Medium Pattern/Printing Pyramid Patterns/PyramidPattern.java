class PyramidPattern {

    /*
    n = 1 2 3 4 5
    spacesCount = 4 3 2 1 0
    stars = 1 3 5 7 9
    */

    private static void printPyramidPattern(int n) {

        for(int row = 1; row <= n; row ++) {

            int spacesCount = n - row;

            for(int spaces = 1; spaces <= spacesCount; spaces ++) {

                System.out.print(" ");
            }

            for(int stars = 1; stars <= (2 * row) - 1; stars ++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        printPyramidPattern(n);
    }
}
