package Pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    private Collection<PessoaFisica> Socios = new ArrayList();

    //Metodo para criação de doação vazia
    public PessoaJuridica() {
    }
    //Metodo para criação de doação com sobrecarga
    public PessoaJuridica(String nome, String endereço, String email, String senha, String cnpj, String razaoSocial, Collection<PessoaFisica> socios) {
        super(nome, endereço, email, senha);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        Socios = socios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Collection<PessoaFisica> getSocios() {
        return Socios;
    }

    public void setSocios(Collection<PessoaFisica> socios) {
        Socios = socios;
    }

    @Override
    public String toString() {
        return super.toString() +

                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", Socios=" + Socios + "(PessoaJuridica) } "
                ;
    }

    //Metodo para cadastrar pessoas juridicas
    public void CadastroJuridico() {

        this.setNome(JOptionPane.showInputDialog("Nome da empresa: "));
        this.setCnpj(JOptionPane.showInputDialog("CNPJ da Empresa: "));
        this.setEndereço(JOptionPane.showInputDialog("Endereço empresarial: "));
        this.setRazaoSocial(JOptionPane.showInputDialog("Razão Social: "));
        this.setEmail(JOptionPane.showInputDialog("Email para login: "));

        int continuar = 0;
        do {
            String senhaTeste = JOptionPane.showInputDialog("Senha: ");
            String senhaTeste2 = JOptionPane.showInputDialog("Confirme a senha: ");
            if (!senhaTeste.equals(senhaTeste2)) {
                System.out.println("As Senhas não são iguais tente novamente ");
            } else {

                System.out.println("Tudo certo!");
                continuar = 1;
                this.setSenha(senhaTeste);
            }
        } while (continuar == 0);

    }


}
