class First {
    public char ch;

    public First(char ch) {
        this.ch = ch;
    }

    public First(First other) {
        this.ch = other.ch;
    }

    @Override
    public String toString() {
        return "First{ch=" + ch + "}";
    }
}

class Second extends First {
    public String text;

    public Second(char ch, String text) {
        super(ch);
        this.text = text;
    }

    public Second(Second other) {
        super(other);
        this.text = other.text;
    }

    @Override
    public String toString() {
        return "Second{ch=" + ch + ", text='" + text + "'}";
    }
}

class Third extends Second {
    public int number;

    public Third(char ch, String text, int number) {
        super(ch, text);
        this.number = number;
    }

    public Third(Third other) {
        super(other);
        this.number = other.number;
    }

    @Override
    public String toString() {
        return "Third{ch=" + ch + ", text='" + text + "', number=" + number + "}";
    }
}

public class lesson4 {
    public static void main(String[] args) {
        Third a = new Third('K', "test", 42);
        Third b = new Third(a);
        System.out.println(a);
        System.out.println(b);
    }
}
