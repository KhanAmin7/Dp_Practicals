// prac7.java
import java.util.NoSuchElementException;

interface StringIterator {
    boolean hasNext();
    char next();
}

class MyString {
    private final String text;
    private int index = 0;

    public MyString(String text) {
        this.text = text;
    }

    public StringIterator getIterator() {
        return new MyStringIterator(this);
    }

    private class MyStringIterator implements StringIterator {

        private final MyString string;

        public MyStringIterator(MyString string) {
            this.string = string;
        }

        @Override
        public boolean hasNext() {
            return index < string.text.length();
        }

        @Override
        public char next() {
            if (hasNext()) {
                return string.text.charAt(index++);
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}

public class prac7 {
    public static void main(String[] args) {
        MyString myString = new MyString("Hello World");
        StringIterator iterator = myString.getIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
