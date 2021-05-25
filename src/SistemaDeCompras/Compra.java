/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemaDeCompras;

/**
 *
 * @author Eduardo M
 */
public class Compra extends Cliente{
    int quantidade;
    double total;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void CalculaTotal(){
        setTotal(getPreco()*getQuantidade());
    }
    public void imprima(){
        System.out.println("------------------------------------");
        System.out.println("Numero do cliente: "+getCodigoCli());
        System.out.println("Nome do cliente: "+getNome());
        System.out.println("Numero do produto: "+getCodigoPro());
        System.out.println("Quantidade do produto: "+getQuantidade());
        System.out.println("Valor por unidade: "+getPreco());
        System.out.println("Valor total: "+getTotal());
        System.out.println("------------------------------------");
    }
    public void clear(){
        setCodigoCli(0);
        setCodigoPro(0);
        setNome("");
        setPreco(0);
        setQuantidade(0);
        setSexo(' ');
        setTotal(0);
    }
}
