import java.util.Scanner;
class demo017{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value A: ");
        int A =scanner.nextInt();
        System.out.println("Enter value B: ");
        int B =scanner.nextInt();
        int c=A+B;
        System.out.println("The sum of A and B is= "+c);
    }
}