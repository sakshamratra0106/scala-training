import oops.ScalaJava;

public class MainClassJava {

    static void print() {

    }

    public static void main(String[] args) {

        JavaClass javaClass = new JavaClass("Hello");

        System.out.println(javaClass.name);

        System.out.println(JavaClass.newInstance().name);

        SingularObject singularObject = SingularObject.singularObject;
        SingularObject singularObject1 = SingularObject.singularObject;

        A a = SingularObject.singularObject;
        A a1 = SingularObject.singularObject;

        JavaClass javaClass1 = JavaClass.newInstance();

        System.out.println(ScalaJava.newInstance());
    }
}
