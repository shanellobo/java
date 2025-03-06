import java.util.Scanner;
public class Main { 
   public static void main(String[] strings) {
       int l,w,perimeter,area;
       Scanner scanner=new Scanner(System.in);
       System.out.print("enter the length of rectangle");
       l=scanner.nextInt();
       System.out.print("enter the width of rectangle");
       w=scanner.nextInt();
       perimeter = 2 * (l+w);
       area =l*w;
       System.out.println("Perimeter is"+perimeter );
       System.out.printf("Area is"+area);
    }
}
