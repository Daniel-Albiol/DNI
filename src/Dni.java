public class Dni {
    private int number;
    private char letter;
    private static final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',}

    public Dni() {
        number = 0;
    }

    public Dni(int num) {
        number = num;
    }

    public Dni(int num, char s) {
        char c = LETTERS[number % 23];
        System.out.println(num + "c");

    }

    public char getLetter() {
        return letter;
    }

    public void setNumber(int num) {
        number = num;
    }

    public String toString() {
        return number + letter;
    }

    public String toFormattedString() {
        int num;
        num = number;
        System.out.println(num + " = %.3n");
    }

    public boolean correctDni() {
        boolean correct;
        if number > 0 {
            correct = true;
            return =correct;
        }
         else{
            correct = false;
            return correct;
        }



    }

}

