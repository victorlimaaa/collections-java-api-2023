package main.list.basic_operations.compras;

public class Item {
    private String nome;
    private float preco;
    private int quantidade;

    public Item(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
