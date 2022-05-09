public class Produto {

    String id;
    String nome;
    String fabricante;

    public Produto(String nome, String fabricante) {
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
}
