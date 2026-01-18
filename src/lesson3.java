class A {
    public int x;

    public A(int x) {
        this.x = x;
    }

    public void setValue(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{x=" + x + "}";
    }
}

class B extends A {
    public char c;

    public B(int x, char c) {
        super(x);
        this.c = c;
    }

    public void setValue(int x, char c) {
        super.setValue(x);
        this.c = c;
    }

    @Override
    public String toString() {
        return "B{x=" + x + ", c=" + c + "}";
    }
}

class C extends B {
    public String s;

    public C(int x, char c, String s) {
        super(x, c);
        this.s = s;
    }

    public void setValue(int x, char c, String s) {
        super.setValue(x, c);
        this.s = s;
    }

    @Override
    public String toString() {
        return "C{x=" + x + ", c=" + c + ", s='" + s + "'}";
    }
}

public class lesson3 {
    public static void main(String[] args) {
        C obj = new C(100, 'Z', "hello");
        System.out.println(obj);
    }
}