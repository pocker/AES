/**
 * Created by david on 2015.01.03..
 */
public class Main {

    public static void main(String[] args){

        byte b = (byte)0xFF;
        b= (byte)(b & 0xFF);

        b = (byte)(b>>4);
        System.out.println((int)b);
    }
}
