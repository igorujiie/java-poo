package ex1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pessoa {

    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private int anoAtual;
    private String nomePessoa;


    Scanner sc = new Scanner(System.in);
    Calendar cal = GregorianCalendar.getInstance();


    public int calculaIdade(int x, int y, int z) {

        this.anoAtual = z;
        this.idade = this.anoAtual - this.ano;
        return this.idade;
    }

    public int informaIdade() {

        return idade;
    }

    public String informaNome() {
        return nomePessoa;
    }

    public void ajustaDataDeNascimento(int x, int y, int z) {
        this.dia = x;
        this.mes = y;
        this.ano = z;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
}





