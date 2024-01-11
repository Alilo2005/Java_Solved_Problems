public class MagicSquare {
    private final int[][] square;
    private final int n;

    public MagicSquare(int n) {
        this.n = n;
        square = new int[n][n];

        if (n % 2 == 1) {
            generateOddOrderSquare();
        } else if (n % 4 == 0) {
            generateDoublyEvenSquare();
        } else {
            throw new IllegalArgumentException("Only odd and doubly even orders are supported by this combined method.");
        }
    }

    // Siamese method for odd orders
    private void generateOddOrderSquare() {
        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) {
            square[row][col] = num;
            num++;
            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;

            if (square[newRow][newCol] == 0) {
                row = newRow;
                col = newCol;
            } else {
                row = (row + 1) % n;
            }
        }
    }

    // Strachey method for doubly even orders
    private void generateDoublyEvenSquare() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i % 4 == j % 4) || (i % 4 + j % 4 == 3)) {
                    square[i][j] = (n * i) + j + 1;
                } else {
                    square[i][j] = (n * (n - 1 - i)) + (n - j);
                }
            }
        }
    }

    public void display() {
        for (int[] ints : square) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 9; // Change to desired order (odd or doubly even)
        MagicSquare magic = new MagicSquare(n);
        magic.display();
    }
}
