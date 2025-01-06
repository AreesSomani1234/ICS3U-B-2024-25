package day4;

public class emptyBox {
    public static void main(String[] args) {
        int width = 6;
        int height = 4;
        createEmptyBox(width, height);
            }

    private static void createEmptyBox(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
