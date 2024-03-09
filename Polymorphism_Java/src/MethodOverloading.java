
public class MethodOverloading {
    /*
    Note: Method overloading cannot be achieved by only changing the return datatype you will
    have to make changes in the parameters either be it in terms of datatype or parameter count
    */
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static double sum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2.0,3.0));
    }
}
