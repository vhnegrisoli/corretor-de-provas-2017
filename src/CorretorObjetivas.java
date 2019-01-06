
import javax.swing.*;

/**
 * A classe Corretor é responsável por realizar as operações de correção, como
 * por exemplo, determinar a quantidade de acertos, erros, a porcentagem de
 * erros e acertos, a soma das notas caso as questões tenham valores iguais ou
 * diferentes e a criação do gabarito.
 *
 * @author Victor Hugo Negrisoli
 * @version 5.0
 */
public class CorretorObjetivas {

    /**
     * Atributos da classe. gabarito vetor de String responsável por receber um
     * gabarito. aluno vetor de String responsável por receber as alternativas
     * assinaladas pelo aluno. quantidade inteiro responsável por determinar a
     * quantidade total de exercícios da prova.
     */
    String[] gabarito;
    String[] aluno;
    double valoresDiferentes[];
    int quantidade;
    boolean tipoDeValor;
    double valorDaProva, media, notaTotal, valorDasQuestoes;

    public CorretorObjetivas() {
        this.quantidade = quantidade;
        this.valorDaProva = valorDaProva;
        this.media = media;
        this.notaTotal = notaTotal;
    }

    public void setGabarito() {
        gabarito = new String[quantidade];
        UIManager.put("OptionPane.okButtonText", "Informar");
        for (int i = 0; i < quantidade; i++) {
            gabarito[i] = JOptionPane.showInputDialog("Digite o resultado da questão " + (i + 1));
        }

    }

    public void exibirGabarito() {
        String gab = "";
        for (int i = 0; i < gabarito.length; i++) {
            gab = gab + "Questão " + (i + 1) + " - " + gabarito[i] + '\n';
        }
        String exibir = "Gabarito: " + '\n' + gab;
        JOptionPane.showMessageDialog(null, exibir);
    }

    public void respostasAluno() {
        aluno = new String[quantidade];
        UIManager.put("OptionPane.okButtonText", "Informar");
        for (int i = 0; i < quantidade; i++) {
            aluno[i] = JOptionPane.showInputDialog("Digite o resultado da questão " + (i + 1));
        }
    }

    public void exibirAlternativas() {
        String al = "";
        for (int i = 0; i < aluno.length; i++) {
            al = al + "Questão " + (i + 1) + " - " + aluno[i] + '\n';
        }
        String exibir = "Alternativas do aluno: " + '\n' + al;
        JOptionPane.showMessageDialog(null, exibir);
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

    public void valorDasQuestoes() {
        UIManager.put("OptionPane.cancelButtonText", "Voltar");
        UIManager.put("OptionPane.yesButtonText", "Valores iguais");
        UIManager.put("OptionPane.noButtonText", "Valores diferentes");
        int botao = JOptionPane.showConfirmDialog(null, "As questões possuem:");
        double nota = 0;
        valoresDiferentes = new double[quantidade];
        if (botao == JOptionPane.YES_OPTION) {
            tipoDeValor = true;
            valorDasQuestoes = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o valor das questões: "));
            while ((valorDasQuestoes * quantidade != valorDaProva)) {
                valorDasQuestoes = Integer.parseInt(JOptionPane.showInputDialog(
                        "A soma não bate, digite o valor novamente: "));
            }
            nota = acertos() * valorDasQuestoes;
            notaTotal = nota;
        }
        if (botao == JOptionPane.NO_OPTION) {
            tipoDeValor = false;
            double verificador = 0;
            for (int i = 0; i < valoresDiferentes.length; i++) {
                valoresDiferentes[i] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Valor da questão nº " + (i + 1)));
                verificador = verificador + valoresDiferentes[i];
            }
            while (verificador != valorDaProva) {
                JOptionPane.showMessageDialog(null, "A soma não bate, digite o valor novamente: ");
                for (int i = 0; i < valoresDiferentes.length; i++) {
                    valoresDiferentes[i] = Integer.parseInt(JOptionPane.showInputDialog(
                            "Valor da questão nº " + (i + 1)));
                    verificador = verificador + valoresDiferentes[i];
                }
            }
            for (int i = 0; i < quantidade; i++) {
                if (gabarito[i].equals(aluno[i])) {
                    nota = nota + valoresDiferentes[i];
                }
            }
            notaTotal = nota;
        }
        if (botao == JOptionPane.CANCEL_OPTION) {

        }
    }

    /**
     * O método acertos calcula a quantidade de acertos que o aluno obteve em
     * relação às questões objetivas.
     *
     * @return acerto retorna a quantidade de acertos feito pelo aluno na prova.
     */
    public int acertos() {
        int acerto = 0;
        for (int i = 0; i < gabarito.length; i++) {
            if (gabarito[i].equals(aluno[i])) {
                acerto++;
            }
        }
        return acerto;
        //acertos = acerto;
    }

    /**
     * O método erros calcula a quantidade de erros que o aluno obteve em
     * relação às questões objetivas.
     *
     * @return erro retorna a quantidade de erros feito pelo aluno na prova.
     */
    public int erros() {
        int erro = 0;
        for (int i = 0; i < gabarito.length; i++) {
            if (!gabarito[i].equals(aluno[i])) {
                erro++;
            }
        }
        return erro;
    }

    public double porcentagemAcertos() {
        double total = acertos() + erros();
        double porcentagem = (acertos() * 100) / total;
        return porcentagem;
    }

    public double porcentagemErros() {
        double total = acertos() + erros();
        double porcentagem = (erros() * 100) / total;
        return porcentagem;
    }

    /**
     * Método responsável por escrever uma String contendo o gabarito e as
     * alternativas que o aluno assinalou, em sequência.
     *
     * @return mostrar String responsável por escrever o gabarito junto das
     * alternativas assinaladas pelo aluno.
     */
    public void mostrarRespostas(String nomeAluno) {
        
        atualizarValorQuestao();
        
        int resposta;
        UIManager.put("OptionPane.cancelButtonText", "Voltar");
        UIManager.put("OptionPane.yesButtonText", "Informar");
        UIManager.put("OptionPane.noButtonText", "Mais detalhes");
        if (notaTotal >= media) {
            resposta = JOptionPane.showConfirmDialog(null, "Nome do aluno: " + nomeAluno + '\n' + "Acertos: " + acertos() + '\n' + "Erros: " + erros()
                    + '\n' + "Porcentagem de acertos: " + porcentagemAcertos() + "%" + '\n' + "Porcentagem de erros: " + porcentagemErros() + "%"
                    + '\n' + "Nota: " + notaTotal
                    + '\n' + "Situação: Aprovado");
            if(resposta == JOptionPane.NO_OPTION){
                String detalhes = "";
                if(tipoDeValor){
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(aluno[i])){
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " - Correta, vale: " + valorDasQuestoes + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " -  Errada, vale: " + valorDasQuestoes + '\n';
                        }
                    }
                }else{
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(aluno[i])){
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " - Correta, vale: " + valoresDiferentes[i] + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " -  Errada, vale: " + valoresDiferentes[i] + '\n';
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + '\n' + "Gabarito - Aluno - Valor das Questões" + '\n' + detalhes + '\n'
                + "Nota: " + notaTotal);
            }
            
        } else {
            resposta = JOptionPane.showConfirmDialog(null, "Nome do aluno: " + nomeAluno + '\n' + "Acertos: " + acertos() + '\n' + "Erros: " + erros()
                    + '\n' + "Porcentagem de acertos: " + porcentagemAcertos() + "%" + '\n' + "Porcentagem de erros: " + porcentagemErros() + "%"
                    + '\n' + "Nota: " + notaTotal
                    + '\n' + "Situação: Reprovado");
            if(resposta == JOptionPane.NO_OPTION){
                String detalhes = "";
                if(tipoDeValor){
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(aluno[i])){
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " - Correta, vale: " + valorDasQuestoes + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " -  Errada, vale: " + valorDasQuestoes + '\n';
                        }
                    }
                }else{
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(aluno[i])){
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " - Correta, vale: " + valoresDiferentes[i] + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + aluno[i] + " -  Errada, vale: " + valoresDiferentes[i] + '\n';
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + '\n' + "Gabarito - Aluno - Valor das Questões" + '\n' + detalhes + '\n'
                + "Nota: " + notaTotal);
            }
        }

    }

    public void atualizarValorQuestao() {
        double nota = 0;
        if (tipoDeValor == true) {
            nota = valorDasQuestoes * acertos();
            notaTotal = nota;
        } else {
            for (int i = 0; i < quantidade; i++) {
                if (gabarito[i].equals(aluno[i])) {
                    nota = nota + valoresDiferentes[i];
                }
            }
            notaTotal = nota;
        }
    }
}
