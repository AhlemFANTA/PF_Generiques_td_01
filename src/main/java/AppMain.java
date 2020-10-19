

public class AppMain {
    public static void main(String[] arg) {
        int[] t=new int[] {1,2,3};
        Object o=t;
        String s=(String)o;
        System.out.println(o instanceof Object) ;
        System.out.println(o instanceof String) ;
        System.out.println(o instanceof int[]) ;

    }
}
