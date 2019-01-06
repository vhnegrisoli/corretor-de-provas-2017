
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lord Negrisoli
 */
public class CorretorSubjetivas {
    int quantidade;
    double valorDaProva, media, notaTotal;
    double [] questoes;

    public CorretorSubjetivas() {
        this.quantidade = quantidade;
        this.valorDaProva = valorDaProva;
        this.media = media;
        this.notaTotal = notaTotal;
    }
    public void quantidadeDeQuestoes(int quantidadeQuestoes) {
        quantidade = quantidadeQuestoes;
    }
    
    public void valorTotalDaProva(int valorProva) {
        valorDaProva = valorProva;
    }

    public void mediaParaAprovacao(int mediaAprovacao) {
        media = mediaAprovacao;
    }
    
    public void corrigirQuestoes(){
        questoes = new double [quantidade];
        double somarNotasSubjetivas = 0;
        for(int i = 0; i < questoes.length; i++){
            questoes[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota da " + (i + 1) + "ª questão objetiva."));
            somarNotasSubjetivas = somarNotasSubjetivas + questoes[i];
        }
        
        while(somarNotasSubjetivas > valorDaProva){
            JOptionPane.showMessageDialog(null, "A soma não bate, digite os valores novamente.");
            for(int i = 0; i < questoes.length; i++){
                questoes[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota da " + (i + 1) + "ª questão objetiva."));
                somarNotasSubjetivas = somarNotasSubjetivas + questoes[i];
            }
        }
        notaTotal = somarNotasSubjetivas;
    }
    
    public void mostrarRespostas(String nome){
        String mostrar = "";
        for(int i = 0; i < quantidade; i++){
            mostrar = mostrar + "Nota da questão " + (i + 1) + " = " + questoes[i] + '\n';
        }
        if(notaTotal >= media){
            JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + '\n' + '\n' + mostrar + "Nota da prova: " + notaTotal + '\n' + '\n' + "Situação: Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + '\n' + '\n' + mostrar + "Nota da prova: " + notaTotal + '\n' + '\n' + "Situação: Reprovado");
        }
    }
    

}
