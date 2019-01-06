
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
public class CorretorObjetivasSubjetivas {

    /**
     * Atributos da classe. gabarito vetor de String responsável por receber um
     * gabarito. aluno vetor de String responsável por receber as alternativas
     * assinaladas pelo aluno. quantidade inteiro responsável por determinar a
     * quantidade total de exercícios da prova.
     */
    String[] gabarito;
    String[] questoesObjetivas;
    double [] questoesSubjetivas;
    int quantidade, objetiva, subjetiva;
    double valoresDiferentes[];
    boolean tipoDeValor;
    double valorDaProva, media, notaTotal, notaSubjetiva, valorDasQuestoes;

    public CorretorObjetivasSubjetivas() {
        this.quantidade = quantidade;
        this.valorDaProva = valorDaProva;
        this.media = media;
        this.notaTotal = notaTotal;
        this.objetiva = objetiva;
        this.subjetiva = subjetiva;
        this.notaSubjetiva = notaSubjetiva;
    }

    public void setGabarito() {
        gabarito = new String[objetiva];
        UIManager.put("OptionPane.okButtonText", "Informar");
        for (int i = 0; i < objetiva; i++) {
            gabarito[i] = JOptionPane.showInputDialog("Digite o resultado da questão " + (i + 1));
        }

    }
    
    public void exibirGabarito(){
        String gab = "";
        for(int i = 0; i < gabarito.length; i++){
            gab = gab + "Questão " + (i + 1) + " - " + gabarito[i] + '\n';
        }
        String exibir = "Gabarito: " + '\n' + gab; 
        JOptionPane.showMessageDialog(null, exibir);
    }

    public void respostasAluno() {
        questoesObjetivas = new String[objetiva];
        UIManager.put("OptionPane.okButtonText", "Informar");
        for (int i = 0; i < objetiva; i++) {
            questoesObjetivas[i] = JOptionPane.showInputDialog("Digite o resultado da questão " + (i + 1));
        }
    }
    
    public void corrigirSubjetivas(){
        questoesSubjetivas = new double [subjetiva];
        double somarNotasSubjetivas = 0;
        for(int i = 0; i < questoesSubjetivas.length; i++){
            questoesSubjetivas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota da " + (i + 1) + "ª questão objetiva."));
            somarNotasSubjetivas = somarNotasSubjetivas + questoesSubjetivas[i];
        }
        while(somarNotasSubjetivas > valorDaProva){
            JOptionPane.showMessageDialog(null, "A soma não bate, digite os valores novamente.");
            for(int i = 0; i < questoesSubjetivas.length; i++){
                questoesSubjetivas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota da " + (i + 1) + "ª questão objetiva."));
                somarNotasSubjetivas = somarNotasSubjetivas + questoesSubjetivas[i];
            }
        }
        notaSubjetiva = somarNotasSubjetivas;
    }
    
    public void exibirAlternativas(){
        String al = "";
        for(int i = 0; i < questoesObjetivas.length; i++){
            al = al + "Questão " + (i + 1) + " - " + questoesObjetivas[i] + '\n';
        }
        String exibir = "Alternativas do aluno: " + '\n' + al; 
        JOptionPane.showMessageDialog(null, exibir);
    }

    public void quantidadeDeQuestoes(int quantidadeQuestoes) {
        quantidade = quantidadeQuestoes;
        int subjetivas = Integer.parseInt(JOptionPane.showInputDialog("Quantas são subjetivas?"));
        subjetiva = subjetivas;
        objetiva = quantidadeQuestoes - subjetivas;
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
            double somaNotaObjetiva = 0;
            for (int i = 0; i < gabarito.length; i++) {
                if (gabarito[i].equals(questoesObjetivas[i])) {
                    somaNotaObjetiva = somaNotaObjetiva + valoresDiferentes[i];
                }
            }
            nota = somaNotaObjetiva;
        }
        if (botao == JOptionPane.CANCEL_OPTION) {

        }
        notaTotal = nota;
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
            if (gabarito[i].equals(questoesObjetivas[i])) {
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
            if (!gabarito[i].equals(questoesObjetivas[i])) {
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
        UIManager.put("OptionPane.cancelButtonText", "Voltar");
        UIManager.put("OptionPane.yesButtonText", "Informar");
        UIManager.put("OptionPane.noButtonText", "Mais detalhes");
        atualizarValorQuestao();
        int resposta;
        String mostrarSubjetivas = "";
        for(int i = 0; i < gabarito.length; i++){
            mostrarSubjetivas = mostrarSubjetivas + "Nota da questão " + (i + 1) + ": " + questoesSubjetivas[i] + '\n';
        }
        
        if (notaTotal >= media) {
            resposta = JOptionPane.showConfirmDialog(null, "Nome do aluno: " + nomeAluno + '\n' + "Acertos: " + acertos() + '\n' + "Erros: " + erros()
                    + '\n' + "Porcentagem de acertos: " + porcentagemAcertos() + "%" + '\n' + "Porcentagem de erros: " + porcentagemErros() + "%"
                    + '\n' + "Nota: " + (notaTotal + notaSubjetiva)
                    + '\n' + "Situação: Aprovado");
            if(resposta == JOptionPane.NO_OPTION){
                String detalhes = "";
                if(tipoDeValor){
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(questoesObjetivas[i])){
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " - Correta, vale: " + valorDasQuestoes + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " -  Errada, vale: " + valorDasQuestoes + '\n';
                        }
                    }
                }else{
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(questoesObjetivas[i])){
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " - Correta, vale: " + valoresDiferentes[i] + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " -  Errada, vale: " + valoresDiferentes[i] + '\n';
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + '\n' + "Gabarito - Aluno - Valor das Questões" + '\n' + detalhes + '\n'
                + "Nota das questões subjetivas: " + '\n' + '\n' + mostrarSubjetivas + '\n' + "Nota das objetivas: " + notaTotal + '\n' + "Nota das subjetivas: "
                + notaSubjetiva + '\n' + "Nota final: " + (notaTotal + notaSubjetiva));
            }
        } else {
            resposta = JOptionPane.showConfirmDialog(null, "Nome do aluno: " + nomeAluno + '\n' + "Acertos: " + acertos() + '\n' + "Erros: " + erros()
                    + '\n' + "Porcentagem de acertos: " + porcentagemAcertos() + "%" + '\n' + "Porcentagem de erros: " + porcentagemErros() + "%"
                    + '\n' + "Nota: " + (notaTotal + notaSubjetiva)
                    + '\n' + "Situação: Reprovado");
            if(resposta == JOptionPane.NO_OPTION){
                String detalhes = "";
                if(tipoDeValor){
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(questoesObjetivas[i])){
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " - Correta, vale: " + valorDasQuestoes + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " -  Errada, vale: " + valorDasQuestoes + '\n';
                        }
                    }
                }else{
                    for(int i = 0; i < gabarito.length; i++){
                        if(gabarito[i].equals(questoesObjetivas[i])){
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " - Correta, vale: " + valoresDiferentes[i] + '\n';
                        }else{
                            detalhes = detalhes + gabarito[i] + "     " + questoesObjetivas[i] + " -  Errada, vale: " + valoresDiferentes[i] + '\n';
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + '\n' + "Gabarito - Aluno - Valor das Questões" + '\n' + detalhes + '\n'
                + "Nota das questões subjetivas: " + '\n' + '\n'+ mostrarSubjetivas + '\n' + "Nota das objetivas: " + notaTotal + '\n' + "Nota das subjetivas: "
                + notaSubjetiva + '\n' + "Nota final: " + (notaTotal + notaSubjetiva));
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
                if (gabarito[i].equals(questoesObjetivas[i])) {
                    nota = nota + valoresDiferentes[i];
                }
            }
            notaTotal = nota;
        }
    }
}