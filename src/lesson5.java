class Base {
    private String text;

    public Base(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void show() {
        System.out.println(getClass().getSimpleName() + " → " + text);
    }
}

class Child1 extends Base {
    protected int value;

    public Child1(String text, int value) {
        super(text);
        this.value = value;
    }

    @Override
    public void show() {
        System.out.println(getClass().getSimpleName() + " → text=" + getText() + ", value=" + value);
    }
}

class Child2 extends Base {
    protected char symbol;

    public Child2(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        System.out.println(getClass().getSimpleName() + " → text=" + getText() + ", symbol=" + symbol);
    }
}

public class lesson5 {
    public static void main(String[] args) {
        Base a = new Base("alpha");
        Child1 b = new Child1("beta", 100);
        Child2 c = new Child2("gamma", 'X');

        a.show();
        b.show();
        c.show();

        System.out.println("Ссылка на Base");
        Base ref1 = b;
        Base ref2 = c;
        ref1.show();
        ref2.show();
    }
}