package models;

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

    public String getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getDataFab() {
        return dataFab;
    }

    public void setDataFab(Date dataFab) {
        this.dataFab = dataFab;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataVal() {
        return dataVal;
    }

    public void setDataVal(Date dataVal) {
        this.dataVal = dataVal;
    }
}
