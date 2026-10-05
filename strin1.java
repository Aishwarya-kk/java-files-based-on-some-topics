
import java.util.Scanner;

public class strin1{

    public static void PrintLetter(String str){
        for(int i=0;i<=str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println(name);
    System.out.println(name.length());
    String name1="AISHWARYA";
    String name2="K";
    String full=name1+" " +name2;
    System.out.println(full);
    System.out.println(full.charAt(1));
    PrintLetter(full);
}
}