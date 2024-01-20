package br.com.ada.pooii.aula06.srp02;

import java.util.List;

public class Pedido {
    private long id;
    private List<Item> itens;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
