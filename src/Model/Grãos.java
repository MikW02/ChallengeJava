package Model;

import Pessoa.Pessoa;

import javax.swing.*;

public class Grãos extends Doação {

    private String quantidade;

    private String marca;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Metodo para criação de doação vazia
    public Grãos() {
    }
    //Metodo para criação de doação com sobrecarga
    public Grãos(String contribuição, Pessoa doador, String quantidade, String marca) {
        super(contribuição, doador);
        this.quantidade = quantidade;
        this.marca = marca;
    }


    // Metodo para Criar doação especificamente para Graos usando sobrescrita
    @Override
    public void RealizarDoação(Pessoa pessoa) {
        this.setDoador(pessoa);
        this.setContribuição(JOptionPane.showInputDialog("Digite o que será a doação: "));
        this.setQuantidade(JOptionPane.showInputDialog("Digite aqui a quantidade dos grãos: "));
        this.setMarca(JOptionPane.showInputDialog("Digite aqui a marca dos grãos: "));


    }

    @Override
    public String toString() {
        return "Grãos{" +
                "quantidade='" + quantidade + '\'' +
                ", marca='" + marca + '\'' +
                "} " + super.toString();
    }
}