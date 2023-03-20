package oops;

public class Finally_block {
    public static int devide(int a,int b) {
        try {
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("This is a Exception");
        }
        finally {
            System.out.println(" THE END");
        }
        return 0;
    }


    public static void main(String[] args) {

        int d= devide(45,4);
        System.out.println(d);
        int a=7;
        int b=27;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("THIS IS FINALLY");
            }
            b--;
        }
        try{
            System.out.println(a/b);
        }
        finally {
            System.out.println("This is True(Valid java code)");
        }
    }
}
