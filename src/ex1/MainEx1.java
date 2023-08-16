package ex1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainEx1 {
    public static void main(String[] args) {

        Calendar cal = GregorianCalendar.getInstance();

        Pessoa isac = new Pessoa();
        Pessoa albert = new Pessoa();

        isac.setNomePessoa("Isaac Newton");
        isac.ajustaDataDeNascimento(4,1,1643);
        isac.calculaIdade(15,8,2023);

        albert.setNomePessoa("Albert Einstein");
        albert.ajustaDataDeNascimento(14,3,1879);
        albert.calculaIdade(15,8, cal.get(Calendar.YEAR));


        System.out.println("Caso " + albert.informaNome() + " estivesse vivo, sua idade seria " + albert.informaIdade());
        System.out.println("Caso " + isac.informaNome() + " estivesse vivo, sua idade seria " + isac.informaIdade());




    }
}
