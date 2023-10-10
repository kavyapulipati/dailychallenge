import java.util.Scanner;

public class Test {
    private void method1(int age,int cls){
        System.out.println("age is"+" "+age);
        System.out.println("class is"+" "+cls);
    }
     public static void main(String []args){
         Test t=new Test();
         Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int c=sc.nextInt();
         t.method1(a,c);
     }
}
