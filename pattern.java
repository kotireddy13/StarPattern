import java.util.Scanner;
public class pattern {
    public static void printpattern(int q)
    {
        int i,j;
        for(i = 1;i <= q; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
        
                System.out.println();
            }
        }
        
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a num: ");
            int q = sc.nextInt();
            printpattern(q); 
           
        }
        
}

