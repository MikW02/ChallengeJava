package Pessoa;

import javax.swing.*;
import java.util.Objects;

public class PessoaFisica extends Pessoa {

    private String cpf;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    //Metodo para criação de doação vazia
    public PessoaFisica() {
    }

    //Metodo para criação de doação com sobrecarga
    public PessoaFisica(String nome, String endereço, String email, String senha, String cpf) {
        super(nome, endereço, email, senha);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cpf='" + cpf + "(PessoaFisica) } ";

    }
    //Metodo para cadastrar pessoas fisicas
    public void Cadastro() {

        this.setNome(JOptionPane.showInputDialog("Nome: "));
        this.setCpf(JOptionPane.showInputDialog("CPF: "));
        this.setEndereço(JOptionPane.showInputDialog("Endereço: "));
        this.setEmail(JOptionPane.showInputDialog("Email para login: "));

        int continuar = 0;
        do{
            String senhaTeste = JOptionPane.showInputDialog("Senha: ");
            String senhaTeste2 = JOptionPane.showInputDialog("Confirme a Senha: ");
            if (!senhaTeste.equals(senhaTeste2)) {
                System.out.println("As Senhas não são iguais tente novamente ");
            } else  {

                System.out.println("Tudo certo!");
                continuar = 1;
                this.setSenha(senhaTeste);
            }
        }while (continuar == 0);

    }

}

