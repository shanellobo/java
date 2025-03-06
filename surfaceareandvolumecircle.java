import java.util.Scanner;
class Main { 
    public static void main(String[] args) 
    { 
        Scanner s= new Scanner(System.in);
        System.out.print("enter the radius ");
        double r=s.nextInt();
        double surfacearea,volume; 
        surfacearea = 4 * 3.14 * (r * r); 
        volume = ((double)4 / 3) * 3.14 * (r * r * r); 
        System.out.println("surfacearea of sphere ="+ surfacearea); 
        System.out.println("volume of sphere =" + volume); 
    } 
}
