package Exercicios;

public class Main {

    public static void main(String[] args){

        //Exercicio da Calculadora
        System.out.println("Exercicio Calculadora");

        Calculadora.soma(3, 6);
        Calculadora.subtrair(9, 1.8);
        Calculadora.multiplicar(7, 8);
        Calculadora.dividir(5, 2.5);

        System.out.println("------------------------------------------");

        //Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("------------------------------------------");

      //  Exercicio do Emprestimo
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    System.out.println(" https://github.com/tlcdio/MAula01 ");
    }
}
