import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        for (int i = 0; i <= 100; i++){
            if (i % 2 != 0) continue;
           System.out.println(i);
        }
    }
}
