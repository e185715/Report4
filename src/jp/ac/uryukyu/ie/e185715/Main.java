package jp.ac.uryukyu.ie.e185715;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("! NullPointerExceptionだお !");
            System.out.println(e.getMessage());
        }
    }
}
