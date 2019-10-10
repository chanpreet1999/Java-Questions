import java.util.*;
public class SortStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> names=new ArrayList<>();
        System.out.print("How many names you want to add: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            names.add(sc.next());
        }
        Collections.sort(names);
        System.out.println("\nSorted list :");
        System.out.println(names);
    }
    
}
