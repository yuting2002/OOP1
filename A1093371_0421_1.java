import java.util.Scanner;

public class A1093371_0421_1 {
    public static void main(String[] args){
        String text;
        Scanner t = new Scanner(System.in);
        System.out.print("請輸入您的email（範例：aa@aa.aa）: ");
        text = t.nextLine();

        if(text.matches("[a-z]+@[a-z]+.[a-z]+")){
            System.out.println(text+"是正確的email格式。");
        }else{
            System.out.println(text+"不是正確的email格式。");
        }
    }
}
