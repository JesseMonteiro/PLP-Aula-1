package repositories;

import models.*;

import java.util.*;

public class LoteRepository {
    Map<String, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<String, Lote>();
    }


    public Collection<Lote> getAll() {
        return (List<Lote>) this.lotes.values();
    }

    public Lote getLote(String id) {
        return this.lotes.get(id);
    }

    public void delLote(String id) {
        this.lotes.remove(id);
    }

    public void editLote(Lote lote) {
        this.lotes.replace(lote.getId(), lote).getId();
    }

    public String addLote(Lote lote){
        this.lotes.put(lote.getId(), lote).getId();
        return (lote.getId());
    }
}

