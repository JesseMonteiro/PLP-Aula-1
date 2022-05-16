import java.util.Date;
import models.*;
public class main {

    public static void main(String[] args) {

        Produto p = new Produto("leite", "parmalat");
        Lote l1 = new Lote(p, 10, new Date(), new Date());

        System.out.println(l1.toString());

    }
}
