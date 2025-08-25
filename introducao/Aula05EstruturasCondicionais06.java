package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
     //Utilizando switch e dados os valores de 1 a 7, imprima se é diautil ou final de semana
     //considere 1 como domingo
     int dia = 4;
     switch(dia){
         case 1:
             System.out.println("Fim de semana");
             break;
         case 2:
             System.out.println("Dia Util");
             break;
         case 3:
             System.out.println("Dia Util");
             break;
         case 4:
             System.out.println("Dia Util");
             break;
         case 5:
             System.out.println("Dia Util");
             break;
         case 6:
             System.out.println("Dia Util");
             break;
         case 7:
             System.out.println("Fim de Semana");
             break;
         default:
             System.out.println("Invalido");

     }
    }
}
