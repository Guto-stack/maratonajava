package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Augusto";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Ana";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
