import java.util.*;
public class greatestof3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
         System.out.println("enter b");
         int b=sc.nextInt();
          System.out.println("enter c");
          int c=sc.nextInt();

    if(a>b){
        if(a>c){
            System.out.println("a is greater" + a);
        }
        else{
            System.out.println("c is greater "+ c);
        }
    }
    else{
        if(b>c){
            System.out.println("b is greater"+ b);
        }
        else{
            System.out.println("c is greater "+ c);
        }
    }
    }
}
