package repositories;

import models.*;

import java.util.*;

public class ProdutoRepository {

    Map<String, Produto> produtos;

    public ProdutoRepository() {
        this.produtos = new HashMap<String, Produto>();
    }

    public List<Produto> getByName(String nome) {
        List<Produto> prods = new ArrayList<Produto>();
        for (Produto produto : getAll()) {
            if(produto.getNome().toLowerCase().contains(nome.toLowerCase())){
                prods.add(produto);
            }
        }
        return (prods);
    }

    public Collection<Produto> getAll() {
            return (List<Produto>) this.produtos.values();
    }

    public Produto getProd(String id) {
        return this.produtos.get(id);
    }

    public void delProd(String id) {
        this.produtos.remove(id);
    }

    public void editProd(Produto prod) {
        this.produtos.replace(prod.getId(), prod).getId();
    }

    public String addProduto(Produto prod){
        this.produtos.put(prod.getId(), prod).getId();
        return (prod.getId());
    }
}
