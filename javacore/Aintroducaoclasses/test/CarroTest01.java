package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro = carro2;

        carro.nome = "Cobalt";
        carro.modelo = "chevrolet";
        carro.ano = "2017";

        carro2.modelo = "Honda";
        carro2.nome = "Honda Civic";
        carro2.ano = "2024";

        System.out.println("Modelo: " + carro.modelo + " Nome:" + carro.nome + " Ano: " + carro.ano);
        System.out.println("Modelo: " + carro2.modelo + " Nome:" + carro2.nome + " Ano: " + carro2.ano);
    }
}
