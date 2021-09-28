public final class SingularObject implements A {

    private final String name;

    public static final SingularObject singularObject = new SingularObject("Default");

    private SingularObject(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
