package calculadora;


import java.util.List;
import java.util.Scanner;

public  class App {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = List.of(2,4, 8);
        List<Integer>list2= List.of(3,0,9,0,9);



        Calculator calc = new Calculator();
        Calculator.logger.info("""
                Seleccione que operacion desea realizar
                1) sumar
                2) restar
                3) multiplicar
                4) dividir
                5) modulo
                """);
        var value = scan.nextInt();

        switch (value){
            case 1 -> calc.sum(list1,list2);
            case 2 -> calc.restar(list1,list2);
            case 3 -> calc.multiplicar(list1,list2);
            case 4 -> calc.dividir(list1,list2);
            case 5 -> calc.modulo(list1,list2);
            default -> Calculator.logger.info("Ingresa un valor valido");
        }
    }

}