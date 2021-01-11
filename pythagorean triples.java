import java.util.Scanner;
public class pythagoreanTriples {

    public static void main(String[] args) {
        int a, b, c;
        Scanner limit = new Scanner(System.in);  // Create a Scanner object

        System.out.print("enter uper limit: ");
        int l = limit.nextInt();  // Read user input

        if (l<=4){
            System.out.println("pythagorean triples does not exist under the limit"+limit);
        }
        else{
            c=0;
            for (int i=0; i<l; ++i){
                if (i%2==0){
                    a=i;
                    b= (int) (Math.pow((a/2), 2)-1);
                    c= (int) (Math.pow((a/2),2)+1);
                }else{
                    a=i;
                    b=(int) (Math.pow(a,2)-1)/2;
                    c=(int) (Math.pow(a,2)+1)/2;
                }
                if (a>b || c>l){
                    continue;
                }
                System.out.printf("(%4d, %7d, %7d)",a,b,c);
                System.out.println();
            }
        }
    }
}
