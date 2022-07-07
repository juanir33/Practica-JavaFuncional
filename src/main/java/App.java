import java.util.ArrayList;
import java.util.List;

public  class App {


    public static void main(String[] args) {
        List<Integer> list1 = List.of(36,23, 8);
        List<Integer>list2= List.of(12,4,8);


        Calculator calc = new Calculator();
       calc.sum(list1,list2);
       calc.multiplicar(list1,list2,3);
       calc.restar(list1,list2,3);
       calc.dividir(list1, list2);
    }

}