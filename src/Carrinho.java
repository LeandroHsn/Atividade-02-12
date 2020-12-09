import java.util.ArrayList;

public class Carrinho {

    private Double valorTotal = (double) 0;
    private ArrayList<String> produtos = new ArrayList<String>();
    private ArrayList<String> categoria = new ArrayList<String>();
    private ArrayList<Double> preco = new ArrayList<Double>();

    private Pedido pedidos = new Pedido();

    public void adicionar(String produto, String categorias, Double precos) {
        produtos.add(produto);
        categoria.add(categorias);
        preco.add(precos);
    }

    public void mostrarProdutos() {

        for (int indice = 0; indice < produtos.size(); indice++) {

            pedidos.setNome(produtos.get(indice));
            pedidos.setCategoria(categoria.get(indice));
            pedidos.setPreco(preco.get(indice));

            System.out.printf("%d. %s (categoria: %s) - R$%.2f\n", indice, pedidos.getNome(), pedidos.getCategoria(),
                    pedidos.getPreco());
        }
    }

    public void getTotal() {

        for (int index = 0; index < produtos.size(); index++) {
            valorTotal = preco.get(index) + valorTotal;
        }
        System.out.printf("Valor total em R$%.2f", valorTotal);
    }

}