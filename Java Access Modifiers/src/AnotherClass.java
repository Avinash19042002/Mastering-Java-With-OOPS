public class AnotherClass extends PublicModifier{
    public static void main(String[] args) {
        PublicModifier obj= new PublicModifier();
        obj.publicMethod();
        obj.protectedMethod();
        obj.packagePrivateMethod();

    }
}
