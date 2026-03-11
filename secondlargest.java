import java.util.Scanner;
public class Secondlargest {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        int second;
        if(a>=b &&a>=c){
            if(b>=c){
                second=b; 
                     }
            else{
                second=c;
            }

        }
        else if (b>=a && b>=c){
               if(a>=c){
                second=a; 
                     }
            else{
                second =c;
            }
        }

        else {
             if(b>=a){
                second=b; 
                     }
            else{
                second =a;
            }
        }
        System.out.println("Second Largest number is "+ second);
        sc.close();
    }
}
