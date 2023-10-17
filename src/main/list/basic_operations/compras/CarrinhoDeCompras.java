package main.list.basic_operations.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item t: carrinhoList){
            if(t.getNome().equalsIgnoreCase(nome)) 
                itensParaRemover.add(t);
        }
        
        carrinhoList.removeAll(itensParaRemover);
    }

    public float calcularValorTotal() {
        float total = 0;

        for(Item t: carrinhoList){
            total += t.getPreco();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("pao", 5, 1);
        c.adicionarItem("chocolate", 8, 2);

        System.out.println(c.calcularValorTotal());
    }
}
