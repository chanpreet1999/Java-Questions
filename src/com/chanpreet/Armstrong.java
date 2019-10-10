import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int temp=n;
        int arm=0;
        while(n>0){
            int i=n%10;
            arm=arm+i*i*i;
            n=n/10; 
        }
        if(temp==arm){
            System.out.println("Armstrong number ");
        }else System.out.println("Not a Armstrong number");
    }
    
}
