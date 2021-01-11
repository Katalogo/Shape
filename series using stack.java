public class Series{
    public static void main(String[] args)
    {
        Stack<Byte> stk=new Stack<>();
        System.out.println("In Forward Order");
        for(byte i=1; i<=9; i++)
        {
            System.out.print(i+", ");
            stk.push(i);

            byte a = (byte) (i-(i*i));
            System.out.print(a+", ");
            stk.push(a);
        }
        System.out.println();
        System.out.println("In Reverse Order");
        while(!stk.isEmpty())
        {
            System.out.print(stk.peek()+", ");
            stk.pop();
        }
    }
}
