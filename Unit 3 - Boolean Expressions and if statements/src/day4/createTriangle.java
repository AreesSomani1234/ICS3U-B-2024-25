package day4;

public class createTriangle {
    public static void main(String[] args) {
        // createTriangle();
        // int height = 8;
        // createTriangle(height);
        createNewTriangle();
    }

    private static void createNewTriangle() {
        for(int i = 0; i < 5; i++){
            for (int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    // private static void createTriangle(int height) {
    // for (int i = 0; i < height; i++){
    // for (int j = 0; j < i; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

}
