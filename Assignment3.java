import java.util.*;
public class Assignment3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String str=sc.nextLine();
        System.out.print("Enter the Sub-String=");
        String Substr=sc.nextLine();
        int index = str.indexOf(Substr);
        if(index == -1){
            System.out.println("The letter does not exist in the sentence");
        }else{
            System.out.println("Result => "+str.substring(index+1));
        }
    }
}
