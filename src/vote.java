import java.util.Scanner;
public class vote {
    void Age(int age) {
        if (age>=18){
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vote obj = new vote();
        obj.Age(age);
    }
}