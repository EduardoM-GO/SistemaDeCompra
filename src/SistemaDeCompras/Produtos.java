/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeCompras;

import java.util.Scanner;

/**
 *
 * @author Eduardo M
 */
public class Produtos {
    Scanner sc = new Scanner(System.in);
    int CodigoPro;
    double preco;

    public int getCodigoPro() {
        return CodigoPro;
    }

    public void setCodigoPro(int CodigoPro) {
        this.CodigoPro = CodigoPro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   

    public double CalculaDesconto(double valor, int desconto) {
        return (valor - ((valor * desconto) / 100));
    }

    public void Desconto() {
        if (getPreco() >= 100) {
            setPreco(CalculaDesconto(getPreco(), 15));
        } else {
            setPreco(CalculaDesconto(getPreco(), 5));
        }
    }
    public void inserirPro(){
        System.out.println("Digite o numero do produto: ");
        setCodigoPro(sc.nextInt());
        
        double aux;
        do{
            System.out.println("Digite o preço do produto: ");
            aux = sc.nextDouble();
            if (aux >=20 || aux <=350){
                setPreco(aux);
            }
        }while(aux <20 || aux >350);
        
    }
}
