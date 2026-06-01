package krill.dominio;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private double saldo;
    Estoque itens = new Estoque();
    Carrinho inputCar = new Carrinho();
    Scanner scanner = new Scanner(System.in);
    public Cliente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void AcessarLoja(){
        itens.VerificarEstoque();
        do{
            System.out.print("Deseja adicionar algum item ao carrinho, digite S/N--> ");
            String inputEscolha = scanner.nextLine();
            if(inputEscolha.equals("S")){
                System.out.println("Escolha o numero do item que você deseja: ");
                int itemId = scanner.nextInt();
                scanner.nextLine();
                inputCar.Adicionar(itens.estoque[itemId]);
            }else if(inputEscolha.equals("N")){
                System.out.println("Operação realizada com sucesso!");
                break;
            }
        }while(true);
        if(inputCar.TotalCar() <= 0){
            System.out.println("Obrigado pela visita, volte sempre!");
        } else {
            System.out.print("Deseja verificar seu carrinho? S/N-->");
            String verificidade = scanner.nextLine();
            if(verificidade.equals("S")){
                inputCar.viewCar();
                System.out.println("Comprar?S/N-->");
                String comprar = scanner.nextLine();
                if(comprar.equals("S")){
                    if(this.saldo>= inputCar.TotalCar()){
                        this.saldo -= inputCar.TotalCar();
                        System.out.println("Compra realizada com sucesso!");
                        System.out.println("Gasto: "+inputCar.TotalCar());
                    }else {
                        System.out.println("Saldo insuficiente!");
                    }
                }else{
                    System.out.println("Volte Sempre!");
                }
            }
        }
    }

}
