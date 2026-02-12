package br.com.fiap.main;

import br.com.fiap.entities.Aluno;

import javax.swing.*;

public class TesteAlunoVetor {

    //String Static
    static String texto(String t) {
        return JOptionPane.showInputDialog(t);
    }


    //Static Int
    static int inteiro(String i){
        return Integer.parseInt(JOptionPane.showInputDialog(i));
        }


    //Static Double
    static double real(String d){
        return Double.parseDouble(JOptionPane.showInputDialog(d));
    }




    public static void main(String[] args) {


    // Preparar o vetor com a quantidade máxima
    Aluno[] vetorAluno = new Aluno[3]; // [] [] [] 3 posições

    // Controla as posições do vetores
        int indice = 0;
    //laço de repetição

    // do while fazer enquanto

    do {

        vetorAluno[indice] = new Aluno();
        vetorAluno[indice].setNome(texto("Nome"));
        vetorAluno[indice].setIdade(inteiro("Idade:"));
        vetorAluno[indice].setNota(real("Nota:"));
        vetorAluno[indice].setRM(texto("RM:"));
        vetorAluno[indice].setTurma(texto("Turma:"));

        indice ++;

    } while (JOptionPane.showConfirmDialog(null,"Cadastrar mais alunos?", "CADASTRO DE ALUNOS",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

    // Saidas utilizando for

        for(int contador = 0; contador < indice; contador ++) {
            System.out.println(
                    "\n\nNome: " + vetorAluno[contador].getNome() +
                    "\nRM:  "  + vetorAluno[contador].getRM()  +
                    "\nIdade: " + vetorAluno[contador].getIdade() +
                    "\nTurma:"  + vetorAluno[contador].getTurma() +
                    "\nNota:"   + vetorAluno[contador].getNota()
            );
        }



    }
}
