package day2;

public class Sign {
    //attributes
    private String message;
    private int width;

    //constructors
    public Sign(String message, int width){
        this.message = message;
        this.width = width;
    }

    //methods
    public int numberOfLines(){
        int messageLength = message.length();
        if(messageLength%width ==0)
            return messageLength / width;
        else{
            return messageLength / width +1;
        }

    }
    public String getLines(){
        int linesNeeded = numberOfLines();
        if(linesNeeded == 0){
            return null;
        }
        else{
            String str = message.substring(0,width);
            return str;
        }
    }
}
