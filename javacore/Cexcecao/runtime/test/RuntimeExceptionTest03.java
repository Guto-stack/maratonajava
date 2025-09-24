package javacore.Cexcecao.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
       abreConexao();
    }

    private static String abreConexao(){
         try{
            System.out.println("Abrindo o Arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
