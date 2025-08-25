package introducao;


public class Aula05ExtruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarbebida = idade >= 18;
        // !
        if (isAutorizadoComprarbebida) {
            System.out.println("Autorizado para comprar bebida alcoolica");
        }else {
            System.out.println("Não Autorizado para comprar bebida alcoolica");
        }


        if (!isAutorizadoComprarbebida) {
            System.out.println("Não Autorizado para comprar bebida alcoolica");
        }
        System.out.println("Fora do IF");
    }
}
