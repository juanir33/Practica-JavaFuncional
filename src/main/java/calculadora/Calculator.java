package calculadora;

import java.util.List;


import org.jboss.logging.Logger;
public class Calculator {
    public static final Logger logger = Logger.getLogger(Calculator.class);


    public void sum(List<Integer> list1, List<Integer> list2){
        var add1 = list1.stream().reduce(Integer::sum).orElse(1);
        var add2 = list2.stream().reduce(Integer::sum).orElse(1);

        var suma = add1+add2;
        logger.info("La suma de los elementos de los arrays es " +
                 suma);


    }
    public void multiplicar(List<Integer> list1, List<Integer> list2){

        if(list1.size() > list2.size()){
            throw new IllegalArgumentException("Las listas deben ser del mismo tamaño");}

       list1.stream().map(el -> {
            int  i = list1.indexOf(el);
           return el * list2.get(i);
       }).forEach(ele -> logger.info("La multiplicacion es igual a: \n"+
               ele));







    }
    public void restar(List<Integer> list1, List<Integer> list2){
        list1.stream().map(el -> {
            int  i = list1.indexOf(el);
            return el - list2.get(i);
        }).forEach(ele -> logger.info("La resta es igual a: \n"+
                ele));
    }
    public void dividir(List<Integer> list1, List<Integer> list2){
        if(list1.contains(0)){throw
                new IllegalArgumentException("El array contiene zeros, es posible que no se pueda realizar la operacion");}

        list1.stream().map(el -> {
            int  i = list1.indexOf(el);
            return el / list2.get(i);
        }).forEach(ele -> logger.info("La division es igual a: \n"+
                ele));


    }


}
