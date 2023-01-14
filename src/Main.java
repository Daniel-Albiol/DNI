import java.util.Scanner;
public class Main {
    public short void main(String[] args){
        System.out.println("Enter DNI: ");
        Scanner inputValue = new Scanner(System.in);
        double newnum = inputValue.nextDouble();
        char leteer;
        System.out.println("Enter letter: ");
        leteer = Scanner inputValue.next().charAt(0);
        if (!correctDni()){
            System.out.println("Dni incorrect.");
        }else{
            System.out.println("Dni is correct.");
        }


    }
}
