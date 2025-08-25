package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor, por exemplo, 50
    public static void main(String[] args) {
        int valormax = 50;
        for (int i = 1; i <= valormax; i++) {
            if ( i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
