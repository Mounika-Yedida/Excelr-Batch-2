import java.util.Scanner;
class Demo036{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a:");
        int a=sc.nextInt();
        System.out.println("b:");
        int b=sc.nextInt();
        System.out.println("c:");
        int c=sc.nextInt();
        if(a>b && a>c){
             System.out.println("The biggest number is:"+a); 
        }
        else if(b>a && b>c){
             System.out.println("The biggest number is:"+b); 
        }
        else{
             System.out.println("The biggest number is:"+c); 
        }
    }
}
        