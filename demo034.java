import java.util.Scanner;
class demo034{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("It is Even");
        }else{
            System.out.println("It is odd");
        }
    }
}