package Model;

import Pessoa.Pessoa;

import javax.swing.*;

public class Verduras extends Doação {

    private String quantidade;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    //Metodo para criação de doação com sobrecarga
    public Verduras(String contribuição, Pessoa doador, String quantidade) {
        super(contribuição, doador);
        this.quantidade = quantidade;
    }

    //Metodo para criação de doação vazia
    public Verduras() {
    }


    // Metodo para Criar doação especificamente para Verduras usando sobrescrita
    @Override
    public void RealizarDoação(Pessoa pessoa) {
        this.setDoador(pessoa);
        this.setContribuição(JOptionPane.showInputDialog("Digite o que tipo de verdura: "));
        this.setQuantidade(JOptionPane.showInputDialog("Digite aqui a quantidade do que será doado: "));


    }


    @Override
    public String toString() {
        return "Frutas{" +
                "quantidade=" + quantidade +
                "} " + super.toString();
    }
}