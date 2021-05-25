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
public class Cliente extends Produtos {

    int CodigoCli;
    String nome;
    char sexo;

    public int getCodigoCli() {
        return CodigoCli;
    }

    public void setCodigoCli(int CodigoCli) {
        this.CodigoCli = CodigoCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void CalculaDescontoAdic() {
        if (getSexo() == 'F') {
            setPreco(CalculaDesconto(getPreco(), 5));
        }
    }

    public void inserirCli() {
        System.out.println("Digite o codigo: ");
        setCodigoCli(sc.nextInt());
        System.out.println("Digite o Nome: ");
        setNome(sc.next());
        int i;
        do {
            System.out.println("Digite 1 para Masculino ou 2 para Feminino");
            i = sc.nextInt();
            if (i == 1) {
                setSexo('M');
            } else if (i == 2) {
                setSexo('F');
            }
        } while (i < 1 || i > 2);
    }

}
