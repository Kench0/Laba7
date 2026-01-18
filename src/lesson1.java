class Super {
    private String text;

    public Super(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{text='" + text + "'}";
    }
}

class Sub extends Super {
    private String extra;

    public Sub(String text) {
        super(text);
        this.extra = "";
    }

    public Sub(String text, String extra) {
        super(text);
        this.extra = extra;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{text='" + super.toString() + "', extra='" + extra + "'}";
    }
}

public class lesson1 {
    public static void main(String[] args) {
        Super a = new Super("Один");
        Sub b = new Sub("Два");
        Sub c = new Sub("Три", "Четыре");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}