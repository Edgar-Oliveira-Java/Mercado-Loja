package krill.dominio;

public class Estoque {
    Produto[] estoque = new Produto[10];
    {
        estoque[0] = new Produto("Bife", 19.90, "Carnes");
        estoque[1] = new Produto("Alface", 5, "Legumes e Verduras");
        estoque[2] = new Produto("Detergente", 3.40, "Limpeza");
        estoque[3] = new Produto("Hamburguer", 24.40, "Carnes");
        estoque[4] = new Produto("Papricá", 1.50, "Temperos");
        estoque[5] = new Produto("Cenoura", 8.50, "Legumes e verduras");
        estoque[6] = new Produto("Bolo", 12.30, "Doces e Padaria");
        estoque[7] = new Produto("Pão frances", 6, "Doces e Padaria");
        estoque[8] = new Produto("Beterraba", 12.50, "Legumes e Verduras");
        estoque[9] = new Produto("Café", 34.90, "Alimentos");
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
