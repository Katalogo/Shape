import java.util.Scanner;
//Simple Java Program To box, diamond With Asterisks
public class Shape {
    static void box(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Side length: ");
        int l = sc.nextInt();
        System.out.println("an box of side "+l);

        for (int i=1; i<=l; i++){
            if (i==1){
                for (int j=1; j<=l; j++){
                    System.out.print("*  ");
                }
                System.out.println();
            } else if (i>1  && i<l){
                for (int j=1; j<=l; j++){
                    if (j==1 || j==l){
                        System.out.print("*  ");
                    } else{
                        System.out.print("   ");
                    }
                }System.out.println();
            } else {
                for (int j = 1; j <= l; j++) {
                    System.out.print("*  ");
                }
            }
        }
    }
    //===================================================================
    static void diamond(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of Diamond: ");
        byte r = scanner.nextByte();
        if(r%2!=0){
            for (int i=0; i<=r/2; i++){
                for (int j=0; j<=r; j++){
                    if (j==r/2-i||j==r/2+i){
                        System.out.print("*  ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }

            for (int i=r/2-1; i>=0; i--){
                for (int j=0; j<=r; j++){
                    if (j==r/2-i||j==r/2+i){
                        System.out.print("*  ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("enter odd integer for height");
        }
    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Box : 1\nDiamond : 2\n================");

	System.out.print("enter Shape no.: ");
	int N = s.nextInt();
	System.out.print("choose ");

        int shape = 4;
        switch (shape) {
            case 1:
                box();
                break;
            case 2:
                diamond();
                break;
        }
    }
}
