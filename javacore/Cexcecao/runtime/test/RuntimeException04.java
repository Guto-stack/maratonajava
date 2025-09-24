package javacore.Cexcecao.runtime.test;

public class RuntimeException04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndex....");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndex...");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do Illegal....");
        }catch (ArithmeticException e ){
            System.out.println("Dentro do Arithmetic...");
        }
    }
}
