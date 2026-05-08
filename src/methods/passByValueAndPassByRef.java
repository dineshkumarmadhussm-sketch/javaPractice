package methods;
public class passByValueAndPassByRef {
    public static void change(int x){
        x =10;
    }

   public  static void main(String[] args) {
       int x = 6;
       change(x);
       System.out.println(x);
    }
}