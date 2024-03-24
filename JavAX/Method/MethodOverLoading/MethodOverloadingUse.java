package Method.MethodOverLoading;

public class MethodOverloadingUse {
    void add(){
        System.out.println();
    }
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }

    void add(String a, String b){
        System.out.println(a+b);
    }

}
