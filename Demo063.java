import java.util.Scanner;
class Demo063{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter"+n+"elements:");
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("First Element:"+arr[0]);
        System.out.println("Last Element:"+arr[n - 1]);
        System.out.println("The sum of first and last element:"+
        (arr[0]+arr[n - 1]));
    }
}