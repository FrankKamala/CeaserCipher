import java.util.Scanner;

public class Hider {
 private String mData;
 private Scanner we= new Scanner(System.in);
public boolean isString(){
    System.out.println("Enter Input :");
    System.out.println("");
    if(we.hasNextInt()){
        return false;
    }else if (we.hasNext()){
        this.mData=we.nextLine();
        return true;
    }
    return true;
}
public String isString(boolean str){
    if (str){
        return this.mData;
    }
    return "";
}
public String encoderData(String str,int range) {

    str = str.toLowerCase();
    char[] arrayString = str.toCharArray();
    int value = 0, difference = 0;
    for (int i = 0; i < arrayString.length; i++) {
        value = (int) arrayString[i];
        difference = value + range - 1;
        if (value >= 97 && value <= 122) {
            if (difference > 122) {
                difference = (difference - 122) + 97;
                arrayString[i] = (char) difference;
            } else {
                arrayString[i] = (char) (difference + 1);
            }

        }

    }
    return String.valueOf(arrayString);
}
    public String decoderData(String str,int range){
        str=str.toLowerCase();
        char []arrayString=str.toCharArray();
        int value=0,difference=0;
        for(int i=0;i<arrayString.length;i++){
            value=(int)arrayString[i];
            difference=value-(range-1);
            if(value>=97 && value<=122) {
                if (difference < 97) {
                    difference = (difference + 122) - 97;
                    arrayString[i] = (char) (difference);
                } else {
                    arrayString[i] = (char) (difference-1);
                }
            }
        }
        return String.valueOf(arrayString);
    }
    public Integer getRange(){
        System.out.println("Get Range");
        System.out.println("");
        return  we.nextInt();
    }
    public char getOption(){
        System.out.println("D to decode E to encode");
        System.out.println("");
        return  we.next().charAt(0);
    }
}
