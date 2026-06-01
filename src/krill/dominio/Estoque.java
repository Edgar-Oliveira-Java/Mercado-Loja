package krill.dominio;

public class Estoque {
    Produto[] estoque = new Produto[10];
    public Estoque(){
        estoque[0] = new Produto("Bife", 19.90, "Carnes");
        estoque[1] = new Produto("Alface", 5, "Legumes e Verduras");
        estoque[2] = new Produto("Detergente", 3.40, "Limpeza");
    }

    public void VerificarEstoque(){
        for(int i = 0;i<estoque.length;i++){
            if(estoque[i] == null){break;}
            System.out.println("---------------------");
            System.out.println("Item "+i+": "+estoque[i].nome);
            System.out.println("Preco: "+estoque[i].preco);
        }
        System.out.println("---------------------");
        System.out.println();
    }
}
