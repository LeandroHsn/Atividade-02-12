public class App {
    public static void main(String[] args) {

        Carrinho comprar = new Carrinho();

        System.out.println("\nAdicionar ao carrinho os produtos. \n");

        comprar.adicionar("Geladeira", "Eletrodomestico", 1000.00);
        comprar.adicionar("Aviao", "Veículo", 1000000.00);
        comprar.adicionar("Blusa de frio", "Roupas", 150.00);
        comprar.adicionar("Tênis Nike 16", "Sapatos", 250.25);

        comprar.mostrarProdutos();

        comprar.getTotal();

        System.out.println("\nFinalizar a compra. \n\n");

    }
}
