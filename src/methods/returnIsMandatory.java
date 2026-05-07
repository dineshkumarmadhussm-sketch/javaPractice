package methods;

public class returnIsMandatory {
   public static void main(String[] args) {
       System.out.println(ananya(3));
    }
    public static int ananya(int a){
       if(a<5){
           return a;
       }
       return 0;
    }
}
