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
public String encoderData(String str,int range){

    str=str.toLowerCase();
    char []arrayString=str.toCharArray();
    int value=0,difference=0;

}

}
