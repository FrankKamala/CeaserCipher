public class App {
    public static void main(String[]args){
        Hider encrp=new Hider();
        String input ="";
        input=encrp.isString(encrp.isString());
        int range=encrp.getRange();
        if (input.length() >= 1 && range<=25) {
            switch (encrp.getOption()){
                case 'D':
                    System.out.println(" Your Encoded Result is :"+encrp.decoderData(input,range));
                    break;
                case 'E':
                    System.out.println("Decoded Result is :"+encrp.encoderData(input,range));
                    break;
            }
        } else {
            System.out.println("Check Your Inputs");
        }
    }

    private static void setInstruction(Integer num,String str){
        str=num.toString()+"."+str;
        for(int i=0;i<str.length();i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    private static void setInstructions(){
        System.out.println("Instructions");
        setInstruction(1,"Range Limit 25");
        setInstruction(2,"Input Should Only Be String");

    }
}
