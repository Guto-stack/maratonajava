package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição é que o valorparcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 125000;
        for (int i = 1; i <= valorTotal; i++) {
            if (valorTotal / i < 1000){
                System.out.println("Nao é possivel parcelar esse tanto de vezes");
                break;
            }else {
                System.out.println("O carro pode ser parcelado em "+i+" vezes");
            }
        }
    }
}
