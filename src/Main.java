import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cumle daxil et");
        String sentences =scanner.nextLine();
        String[] words=sentences.toLowerCase().split(" ");
        HashSet<String> uniquewords=new HashSet<>();
        for (String word:words){
            uniquewords.add(word);
        }
        System.out.println("unique words: "+uniquewords.size());
    }
}
