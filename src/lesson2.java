class Super2 {
    private String text;

    public Super2(String text) {
        this.text = text;
    }

    public void setValue(String s) {
        this.text = s;
    }

    public int length() {
        return text.length();
    }

    public String getText() {
        return text;
    }
}

class Sub2 extends Super2 {
    public int number;

    public Sub2(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setValue() {
        super.setValue("");
        number = 0;
    }

    public void setValue(String s) {
        super.setValue(s);
    }

    public void setValue(int n) {
        this.number = n;
    }

    public void setValue(String s, int n) {
        super.setValue(s);
        this.number = n;
    }

    @Override
    public String toString() {
        return "Sub{text = '" + getText() + "', number = " + number + "}";
    }
}

public class lesson2 {
    public static void main(String[] args) {
        Sub2 obj = new Sub2(10, "test");
        System.out.println(obj);
        obj.setValue();
        System.out.println(obj);
        obj.setValue("new", 25);
        System.out.println(obj);
    }
}