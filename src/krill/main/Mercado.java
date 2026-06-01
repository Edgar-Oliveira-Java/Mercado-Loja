package krill.main;

import krill.dominio.Cliente;
import krill.dominio.Estoque;

public class Mercado {
    public static void main(String[] args){
        Cliente edgar = new Cliente("Edgar", 1500);
        edgar.AcessarLoja();
    }
}
