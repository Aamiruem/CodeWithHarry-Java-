// package L85FinallyBlock;

public class FinallyBlock {
    public static int greet(){
        try{
            int a = 50;
            int b =10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        finally{
            System.out.println(" Cleaning up resources.... Finally Block...... This is the end of yhe block");
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = greet();
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        try{
            System.out.println(50/3);
        }
        finally{
            System.out.println("I am finally block");
        }
    }
}
