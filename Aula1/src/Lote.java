import java.util.Date;

public class Lote {
    String id;
    Produto produto;
    Date dataFab;
    int quantidade;
    Date dataVal;

    public Lote(Produto produto, int quantidade, Date dataFab, Date dataVal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataFab = dataFab;
        this.dataVal = dataVal;
     }

    @Override
    public String toString() {
        return "Lote{" +
                "Id='" + id + '\'' +
                ", Produto=" + produto +
                ", Quantidade=" + quantidade +
                ", DataFab=" + dataFab +
                ", DataVal=" + dataVal +
                '}';
    }
}
