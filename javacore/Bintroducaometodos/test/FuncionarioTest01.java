package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario; 

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Augusto";
        funcionario.idade = 28;
        funcionario.salario = new double[]{15000, 10000, 4234.97};
        funcionario.imprime();
        funcionario.mediaSalario();
    }
}