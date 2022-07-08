package calculadora;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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
       int  limit= Math.min(list1.size(), list2.size());

       list1.stream().limit(limit).map(el -> {
            int  i = list1.indexOf(el);
           return el * list2.get(i);
       }).forEach(ele -> logger.info("La multiplicacion es igual a: \n"+
               ele));
    }
    public void restar(List<Integer> list1, List<Integer> list2){
        int  limit= Math.min(list1.size(), list2.size());

        list1.stream().limit(limit).map(el -> {
            int  i = list1.indexOf(el);
            return el - list2.get(i);
        }).forEach(ele -> logger.info("La resta es igual a: \n"+
                ele));
    }

    /**
     * En este metodo, la solucion que utilice para manejar la division por zero fue un operador ternario
     * mostrando el mjs en cada item que sea 0; quise implementar monadas pero no lo logre. Estimo que esta manera
     * de hacerlo no es la correcta.
     *
     */
    public void dividir(List<Integer> list1, List<Integer> list2){
        int  limit= Math.min(list1.size(), list2.size());
       list1.stream().limit(limit).map(el -> {
            int  i = list1.indexOf(el);
            return list2.get(i)==0? "No se puede dividir por 0": el/list2.get(i);
        }).forEach(ele -> logger.info("La division es igual a: \n"+
               ele));

    }

    public void modulo(List<Integer> list1, List<Integer> list2){
        int  limit= Math.min(list1.size(), list2.size());
        list1.stream().limit(limit).map(el -> {
            int  i = list1.indexOf(el);
            return list2.get(i)==0? "No se puede dividir por 0": el%list2.get(i);
        }).forEach(ele -> logger.info("El modulo es igual a: \n"+
                ele));

    }


}
