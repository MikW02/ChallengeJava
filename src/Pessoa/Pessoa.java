package Pessoa;

import javax.swing.*;

public abstract class Pessoa {

    private String Nome;
    private String Endereço;

    private String Email;
    private String Senha;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }


    //Metodo para criação de doação com sobrecarga
    public Pessoa(String nome, String endereço, String email, String senha) {
        Nome = nome;
        Endereço = endereço;
        Email = email;
        Senha = senha;
    }
    //Metodo para criação de doação vazia
    public Pessoa() {
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", Endereço='" + Endereço + '\'' +
                ", Email=|oculto|'" + '\'' +
                ", Senha=|oculto|'"  + '\'' +
                '}';
    }

//Metodo para a validação do email e senha
    public boolean Logar() {

        String emaillogar = JOptionPane.showInputDialog("Digite seu email");

        String senhalogar = JOptionPane.showInputDialog("Digite sua senha");

        if (emaillogar.equals(getEmail()) && senhalogar.equals(getSenha())) {
            System.out.println("Logado");
            return true;

        } else {
            System.out.println("senha ou usuario incorreto");
            return false;
        }
    }

}

