import java.util.Date;

public class main {

    public static void main(String[] args) {

        Produto p = new Produto("leite", "parmalat");
        Lote l1 = new Lote(p, new Date(), new Date());

        System.out.println(l1);

    }
}
