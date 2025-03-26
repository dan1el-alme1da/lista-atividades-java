package com.lista01.questao_08;
import javax.swing.JOptionPane;


public class Resposta_08 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String sobreNome = JOptionPane.showInputDialog("Digite o seu sobrenome:");


        Pessoa pessoa = new Pessoa(nome, sobreNome);
        JOptionPane.showMessageDialog(null, "Nome completo: " + pessoa.getNome() + " " + pessoa.getSobreNome());

    }
}
class Pessoa{
    private String nome;
    private String sobreNome;

    public Pessoa(String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
