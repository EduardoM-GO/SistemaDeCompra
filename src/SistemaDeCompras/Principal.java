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
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos prod[] = new Produtos[10];
        Compra comp = new Compra();
        Cliente cli[] = new Cliente[10];
        int contProd = 0, contCli = 0;
        Compra aux = new Compra();
        int i, temp, auxcli, auxprod;
        do {
            System.out.println("1 - Cadastra cliente");
            System.out.println("2 - Cadastra Produtos");
            System.out.println("3 - Fazer venda");
            System.out.println("0 - Sair ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    if (contCli < 10) {
                        aux.clear();
                        aux.inserirCli();
                        cli[contCli] = new Cliente();
                        cli[contCli].setCodigoCli(aux.getCodigoCli());
                        cli[contCli].setNome(aux.getNome());
                        cli[contCli].setSexo(aux.getSexo());
                        contCli++;
                    } else {
                        System.err.println("Já foi cadastrado o maximo de Cliente");
                    }

                    break;

                case 2:
                    if (contProd < 10) {
                        aux.clear();
                        aux.inserirPro();
                        prod[contProd] = new Produtos();
                        prod[contProd].setCodigoPro(aux.getCodigoPro());
                        prod[contProd].setPreco(aux.getPreco());
                        contProd++;
                    } else {
                        System.err.println("Já foi cadastrado o maximo de produto");
                    }

                    break;
                case 3:
                    auxcli = 20;
                    auxprod = 20;
                    System.out.println("Digite o codigo do cliente: ");
                    temp = sc.nextInt();
                    for (int j = 0; j < contCli; j++) {
                        if (temp == cli[j].getCodigoCli()) {
                            auxcli = j;
                        }
                    }
                    if (auxcli != 20) {
                        System.out.println("Digite o codigo do produto: ");
                        temp = sc.nextInt();
                        for (int j = 0; j < contProd; j++) {
                            if (temp == prod[j].getCodigoPro()) {
                                auxprod = j;
                            }
                        }
                        if (auxprod != 20) {
                            comp.setCodigoCli(cli[auxcli].getCodigoCli());
                            comp.setNome(cli[auxcli].getNome());
                            comp.setSexo(cli[auxcli].getSexo());

                            comp.setCodigoPro(prod[auxprod].getCodigoPro());
                            comp.setPreco(prod[auxprod].getPreco());
                            comp.Desconto();
                            comp.CalculaDescontoAdic();
                            System.out.println("Digite a quantidade de produto: ");
                            comp.setQuantidade(sc.nextInt());
                            comp.CalculaTotal();
                            comp.imprima();
                        } else {
                            System.err.println("Produto inexistente");
                        }
                    } else {
                        System.err.println("Cliente inexistente");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Opção inválida");
                    break;
            }
        } while (i != 0);
    }
}
