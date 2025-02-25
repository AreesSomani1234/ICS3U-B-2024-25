package day7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int needsUpdate = sc.nextInt();

        for(int i = 0; i < needsUpdate;i++){
            sc.nextLine();
            String code = sc.nextLine();
            String str = "";
            int sum = 0;

            for(int j = 0; j < code.length();j++){
                char c = code.charAt(j); 
                int ascii = (int) code.charAt(j);
                if(65 <= ascii && ascii <= 90){
                    str += c;
                }
                if(48<= ascii && 57 <= ascii){
                    sum += ascii - 48;
                    
                }
            }
            System.out.println(str+sum);
            
        }
    }
}
