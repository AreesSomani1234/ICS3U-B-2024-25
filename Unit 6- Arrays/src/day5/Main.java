// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int daysOfData = sc.nextInt();
//         sc.nextLine();
//         String[] arr = new String[daysOfData];
//         for(int i = 0; i < daysOfData; i++){
//             String weather = sc.nextLine();
//             arr[i] = weather;
//         }
//         int consectutiveDays = 0;
//         boolean h = false;
//         int result = 0;
//         for(int j= 0; j < arr.length;j++){
//             if(arr[j].equals("S")){
//                 consectutiveDays++;
//             }
//             if(arr[j].equals("P") && h == true){
//                 h = false;
//                 consectutiveDays = 0;
//             }
//             if(arr[j].equals( "P")){
//                 h = true;
//             }
//             if(arr[j].equals("S") && h == true){
//                 result = consectutiveDays + 1;
//             }
//         }
//         System.out.println(result);
        
//     }
// }
