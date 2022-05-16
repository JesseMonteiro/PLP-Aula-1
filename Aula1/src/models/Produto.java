package models;

import java.rmi.server.UID;

public class Produto {

    String id;
    String nome;
    String fabricante;

    public Produto(String nome, String fabricante) {
        this.id = new UID().toString();
        this.nome = nome;
        this.fabricante = fabricante;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "Id='" + id + '\'' +
                ", Nome='" + nome + '\'' +
                ", Fabricante='" + fabricante + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
