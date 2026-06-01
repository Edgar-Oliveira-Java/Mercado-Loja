package krill.dominio;

public class Carrinho {
    Produto[] carrinhoDeCompras = new Produto[6];
    int slot = 0;
    public void Adicionar(Produto produto){
        carrinhoDeCompras[slot] = produto;
        slot++;
    }

    public void viewCar(){
        for(Produto viewCar: carrinhoDeCompras){
            if(viewCar == null){break;}
            System.out.println("Seu carrinho:");
            System.out.println(viewCar.nome);
            System.out.println("Preço "+viewCar.preco);
            System.out.println();
        }
        System.out.println("Total do carrinho: "+TotalCar());
    }
    public double TotalCar(){
        double soma = 0;
        for(Produto totality: carrinhoDeCompras){
            if(totality==null){break;}
            soma += totality.preco;
        }
        return soma;
    }
}
