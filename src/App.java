import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    


        List<Integer> intList  = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        List<? extends Number> list = intList;

        //GET OK
        Number x = list.get(0);

        System.out.println(x);

      // PUT ERROR
      // INCOMPATIBILIDADE,COMPILADOR NAO SABE SE O NUMERO 20 VAI SER COMPATIVEL COM ALGUM OUTRO POSSIVEL TIPO NUMBER
      // list.add(20);







    }
}
