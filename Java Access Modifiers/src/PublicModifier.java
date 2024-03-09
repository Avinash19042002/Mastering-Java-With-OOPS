/*
            class     package    subclass(subclass of the
                               class declared outside this package)   world

public        Y          Y           Y                                  Y

protected     Y          Y           Y                                  N

default       Y          Y           N                                  N

private       Y          N           N                                  N

*/
public class PublicModifier {
    public int publicVariable=2;
    private int privateVariable=4;
    protected int protectedVariable=5;

    int privatePackagevariable;
     public void publicMethod(){
        System.out.println("This is a public Method");
    }
    private void privateMethod(){
        System.out.println("This is a private method");
    }
    protected void protectedMethod(){
        System.out.println("This is a protected method");
    }

    void packagePrivateMethod(){
        System.out.println("This is a default method");
    }
    public static void main(String[] args) {
        PublicModifier obj = new PublicModifier();
        obj.privateMethod();
        obj.protectedMethod();
        obj.packagePrivateMethod();


    }
}
