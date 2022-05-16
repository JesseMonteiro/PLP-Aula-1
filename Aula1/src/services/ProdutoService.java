package services;

import models.Lote;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    LoteRepository loteRep;
    ProdutoRepository prodRep;

    public ProdutoService() {
        this.loteRep = new LoteRepository();
        this.prodRep = new ProdutoRepository();
    }

    private List<Produto> listarProdsLoteByName(String loteName){
        List<Produto> prods = getProdsWithLote();

        List<Produto> prodsResult = new ArrayList<Produto>();
        for (Produto produto : prods) {
            if(produto.getNome().toLowerCase().contains(loteName.toLowerCase()))
            {
                prodsResult.add(produto);
            }
        }

        return (prodsResult);

    }

    private List<Produto> getProdsWithLote(){
        List<Produto> prods = new ArrayList<Produto>();
        for (Lote lote : this.loteRep.getAll()) {
            prods.add(lote.getProduto());
        }
        return (prods);
    }

}
