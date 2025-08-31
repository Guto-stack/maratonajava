package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (int i = 0; i <salario.length; i++){
            System.out.println(salario[i]);
        }
    }

    public void mediaSalario(){
        double media = 0;
        if (salario == null) {
            return;
        }
        for (int i = 0; i < salario.length; i++){
            media += salario[i];
        }
        System.out.println("A media salaria é: "+media/salario.length);
    }

}
