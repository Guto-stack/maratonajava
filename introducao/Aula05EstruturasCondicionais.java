package introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //informe o dia da semana considereno 1 como domingo
        byte dia = 11;
        //char, int, , byte, string, enum
        switch (dia){
            default:
                System.out.println("Opção invalida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
                case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

    }
}
