package Model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Item> itens = new ArrayList<>();

    public void adicionarItem (Item item) {
        this.itens.add(item);
    }

    public void removerItem (Item item) {
        this.itens.remove(item);
    }

    public boolean temItem(String nomeDoItem) {
        for (Item i : itens) {
            if (i.getNome().equals(nomeDoItem)) {
                return true;
            }
        }
        return false;
    }

    public Item inspecionarItem(String nomeDoItem) {
        for (Item i : itens) {
            if (i.getNome().equals(nomeDoItem)) {
                return i;
            }
        }
        return null;
    }

    public List<Item> getItens() {
        return this.itens;
    }
}

