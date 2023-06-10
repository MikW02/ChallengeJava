import Pessoa.*;
import Model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        int parar = 1;
        int Cadastro = 0;
        //Criação da pessoa fisica e juridica
        PessoaFisica user = new PessoaFisica();
        PessoaJuridica emp = new PessoaJuridica();

        //Variaveis para os JOptionpaneOptionDIalogs
        Object[] opcoesInicial = {"Cadastro", "Doar", "Encerrar"};
        Object[] opcoesCadastro = {"Pessoa Fisica", "Pessoa Juridica"};
        Object[] opcoesDoação = {"Frutas", "Ovos", "Grãos", "Verduras"};


        //while para o programa ser ultilizada mais de uma vez para realizar o cadastro e depois a doação ou doar quantas vezes quiser
        while (parar == 1) {

            //As opcoes iniciais do menu
            int respostaInicial = JOptionPane.showOptionDialog(
                    null,"Escolha o que voce deseja fazer: " , "Bem-Vindo ao sistema da W.H.E.N.",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesInicial, opcoesInicial);
            if (respostaInicial == 0) {

                //seleção de cadastro
                int respostaCadastro = JOptionPane.showOptionDialog(
                        null, "Escolha o tipo de cadastro ","W.H.E.N.",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesCadastro, opcoesCadastro);

                if (respostaCadastro == 0) {

                    //cadastro fisico
                    user.Cadastro();
                    System.out.println(user);
                    Cadastro = 1;


                } else if (respostaCadastro == 1) {

                    //cadastro juridico
                    emp.CadastroJuridico();
                    System.out.println(emp);
                    //adicionar socios (quantos informar)
                    int numSocios = Integer.parseInt(JOptionPane.showInputDialog("Quantos Socios adicionar? "));
                    Collection<PessoaFisica> Socios = new ArrayList<>();
                    for (int x = numSocios; x > 0; x--) {
                        PessoaFisica socio = new PessoaFisica();
                        socio.Cadastro();
                        System.out.println(socio);
                        Socios.add(socio);
                    }
                    emp.setSocios(Socios);
                    System.out.println(emp);
                    Cadastro = 2;
                }
            } else if (respostaInicial == 1) {
                //Aqui é para doar, caso não tenha se registrado irá voltar ao outro menu
                if (Cadastro == 0) {
                    System.out.println("Você precisa primeiro se registrar ");

                } else if (Cadastro == 1) {

                    //inicia doação como pessoa fisica
                    System.out.println("Você se cadastrou como pessoa Fisica");
                    boolean logado = user.Logar();

                    if (logado == true) {

                        //escolha do que irá doar
                        int respostaDoaçao = JOptionPane.showOptionDialog(
                                null, "Qual tipo será sua doação.", "Escolha: ",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesDoação, opcoesDoação);

                        //Todos aqui ultilizam sobreescrita do metodo e o Ovos ultiliza tambem sobrecarga
                        if (respostaDoaçao == 0) {
                            Frutas doação = new Frutas();
                            doação.RealizarDoação(user);
                            System.out.println("Obrigado por doar " + doação);
                        } else if (respostaDoaçao == 1) {
                            //ultilizando sobrecarga
                            Ovos doação = new Ovos();
                            String doar = JOptionPane.showInputDialog("Digite que tipo de ovo irá doar");
                            doação.RealizarDoação(user,doar);
                            System.out.println("Obrigado por doar " + doação);
                        } else if (respostaDoaçao == 2) {
                            Grãos doação = new Grãos();
                            doação.RealizarDoação(user);
                            System.out.println("Obrigado por doar " + doação);
                        } else if (respostaDoaçao == 3) {
                            Verduras doação = new Verduras();
                            doação.RealizarDoação(user);
                            System.out.println("Obrigado por doar " + doação);
                        }
                    } else {
                        System.out.println("cancelando");

                    }
                } else if (Cadastro == 2) {

                    //inicia doação como pessoa juridica
                    System.out.println("Você se cadastrou como pessoa Juridica");
                    boolean logado = emp.Logar();

                    if (logado == true) {


                        //escolha do que irá doar
                        int respostaDoaçao = JOptionPane.showOptionDialog(
                                null, "Qual tipo será sua doação.", "Escolha: ",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoesDoação, opcoesDoação);

                        //Todos aqui ultilizam sobreescrita do metodo e o Ovos ultiliza tambem sobrecarga
                        if (respostaDoaçao == 0) {
                            Frutas doação = new Frutas();
                            doação.RealizarDoação(emp);
                            System.out.println("Obrigado por doar " + doação);
                        } else if (respostaDoaçao == 1) {
                            //ultilizando sobrecarga
                            Ovos doação = new Ovos();
                            String doar = JOptionPane.showInputDialog("Digite que tipo de ovo irá doar");
                            System.out.println("Obrigado por doar " + doação);
                            doação.RealizarDoação(emp,doar);
                            System.out.println("Obrigado por doar " + doação);
                        } else if (respostaDoaçao == 2) {
                            Grãos doação = new Grãos();
                            doação.RealizarDoação(emp);
                            System.out.println("Obrigado por doar " + doação);
                        } else if (respostaDoaçao == 3) {
                            Verduras doação = new Verduras();
                            doação.RealizarDoação(emp);
                            System.out.println("Obrigado por doar " + doação);
                        }


                    }
                    else {
                        System.out.println("cancelando");

                    }
                }
            }

            //Funcionalidade para parar o programa
            if (respostaInicial == 2) {
                parar = 0;
                System.out.println("Encerrando o sistema");
            }


        }
    }
}
