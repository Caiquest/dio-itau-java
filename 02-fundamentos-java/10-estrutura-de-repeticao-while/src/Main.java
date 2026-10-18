import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var i = 0;
        while (i < args.length){
            System.out.println(args[i]);
            i++;
        }

        i = 0;

        System.out.println("=======================SEPARANDO LAÇOS=======================");

        do{
            System.out.println(args[i]);
            i++;
        }while(args.length > i);
    }
}
