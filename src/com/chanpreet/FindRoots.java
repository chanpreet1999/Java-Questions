import java.util.Scanner;
public class FindRoots {
    
    public static void main(String[] args) {
        //user input 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cofficients of Quardatic Equation ax2 + bx + c = 0......");
        //input cofficient
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        //function called to find roots
        findroots(a,b,c);
        }

    private static void findroots(int a, int b, int c) {
        //D*D=b*b-4*a*c
        int d=b*b-(4*a*c);
        double root1,root2;
        //check D if D>0 then roots are real and distintct
        //if D=0 then both roots are real and same4
        //if D<0 then roots are imagnari
        if(d>0){
            System.out.println("Roots are Real and distnict");
            root1=((-b+Math.sqrt(d))/(2*a)); 
            root2=((-b-Math.sqrt(d))/(2*a));
            System.out.println("Roots are "+root1+" and "+root2);
        }else if(d==0){
            System.out.println("Roots are Real and Equal");
            root1=((-b+Math.sqrt(d))/(2*a)); 
            root2=((-b-Math.sqrt(d))/(2*a));
            System.out.println("Roots are "+root1+" and "+root2);
        }else{
            System.out.println("Roots are Imagenary");
            double real,imag;
            real=(-b/(2*a));
            imag=Math.sqrt(-d)/(2*a);
            System.out.println("Roots are "+String.format("%.2f", real)+"+i"+String.format("%.2f", imag)+" and "+String.format("%.2f", real)+"-i"+String.format("%.2f", imag));
        }
    }
