
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
    public void multiplicar(List<Integer> list1, List<Integer> list2, int depreciar){
        var multi = list1.stream().skip(depreciar).reduce((a,b)->a*b).orElse(1);
        var multi2 = list2.stream().skip(depreciar).reduce((a,b)->a*b).orElse(1);




        var multiplier = multi*multi2;
        logger.info("La multiplicacion de los elementos de los arrays, depreciando los " + depreciar+ " primeros elementos es: "+
                multiplier
        );

    }
    public void restar(List<Integer> list1, List<Integer> list2, int limite){
        var sub1 = list1.stream().limit(limite).reduce((a, b)-> a-b).orElse(-1);
        var sub2 = list2.stream().limit(limite).reduce((a, b)-> a-b).orElse(-1);

        var resta = sub1+sub2;
        logger.info("La resta de los elementos de los arrays, con limite es " +
                resta);
    }
    public void dividir(List<Integer> list1, List<Integer> list2){
        if(list1.contains(0)){throw
                new IllegalArgumentException("El array contiene zeros, es posible que no se pueda realizar la operacion");}
        var div1 = list1.stream().
                           reduce((a,b)-> a/b).orElseThrow();
        var div2 = list2.stream().
                reduce((a,b)-> a/b).orElseThrow();

        var division = div2==0? "No se puede dividir por 0": div1/div2;
        logger.info( "La division del array 1 es : "+ division);

    }


}
