package Model;

import Pessoa.Pessoa;

import javax.swing.*;

public class Ovos extends Doação {

    private int quantidade;


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Ovos(String contribuição, Pessoa doador, int quantidade) {
        super(contribuição, doador);
        this.quantidade = quantidade;
    }
    //Metodo para criação de doação vazia
    public Ovos() {
    }

    // Metodo para Criar doação especificamente para ovos usando sobrescrita
    @Override
    public void RealizarDoação(Pessoa pessoa) {
        this.setDoador(pessoa);
        this.setContribuição("Ovos");
        this.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui apenas com numero de ovos que sera doado: ")));


    }

    public void RealizarDoação(Pessoa pessoa,String doar) {
        this.setDoador(pessoa);
        this.setContribuição(doar);
        this.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui apenas com numero de ovos que sera doado: ")));


    }

    @Override
    public String toString() {
        return "Ovos{" +
                "quantidade=" + quantidade +
                "} " + super.toString();
    }
}