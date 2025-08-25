package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Augusto";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Ana";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        
        impressora.imprime(estudante2);
    
        System.out.println("##############");

        impressora.imprime(estudante1);
        
        impressora.imprime(estudante2);
        
    }
}