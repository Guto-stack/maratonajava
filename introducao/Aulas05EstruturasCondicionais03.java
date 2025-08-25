package introducao;

public class Aulas05EstruturasCondicionais03 {
    public static void main(String[] args) {
       //doar se salario > 2000
        double salario = 2000;
        String mensagemDoar = "Eu vou doar 500 pro guto";
        String mensagemNaoDoar = "Ainda não tenho condições";
        //(condição)  ? verdadeiro : falso
        String resultado =  salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        if (salario > 5000) {
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
