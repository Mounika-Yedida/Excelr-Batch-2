import java.util.Scanner;
class Demo067{
   public static int search(int arr[], int N, int x)
{
 for (int i = 0; i < N; i++) {
           if (arr[i] == x)
               return i;
       }
       return -1;
   }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
        }
    //int arr[] = { 2, 3, 4, 10, 40 };
       System.out.println("Enter the element:");
       int x= sc.nextInt();
       int result = search(arr, arr.length, x);
  if (result == -1)
    System.out.print(
     "Element is not present in array");
  else
 System.out.print("Element is present at index " + result);
}
}
