public class JavaClass {

    public final String name;

    public JavaClass(String name) {
        this.name = name;
    }

    public static JavaClass newInstance() {
        return new JavaClass("sas");
    }
}
