package day1;
public class test {
    public static void main(String[] args) {
        int num = 5;
        while(!(num >= 1 && num <= 10)){
	        System.out.println("Number is not between 1-10! Enter a number between 1-10!");
            num = 11;
    }
    System.out.println(num);
    }

}
