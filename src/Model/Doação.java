package Model;

import Pessoa.*;

import javax.swing.*;

public abstract class Doação {

    private String Contribuição;
    private Pessoa Doador;

    //Metodo para criação de doação com sobrecarga
    public Doação(String contribuição, Pessoa doador) {
        Contribuição = contribuição;
        Doador = doador;
    }

    //Metodo para criação de doação vazia
    public Doação() {
    }

    public String getContribuição() {
        return Contribuição;
    }

    public void setContribuição(String contribuição) {
        Contribuição = contribuição;
    }

    public Pessoa getDoador() {
        return Doador;
    }

    public void setDoador(Pessoa doador) {
        Doador = doador;
    }

    @Override
    public String toString() {
        return "Doação{" +
                "Contribuição='" + Contribuição + '\'' +
                ", Doador=" + Doador +
                '}';
    }


    // Metodo abstrato para poder fazer aso sobrescitas em cada classe

    public abstract void RealizarDoação(Pessoa pessoa);

}
