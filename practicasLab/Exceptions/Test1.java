package Exceptions;




class Excepcion1 extends Exception {}
class Excepcion2 extends Excepcion1 {}

public class Test1 {
    public static void main(String[] args) {
        try {
            throw new Excepcion2();
        } catch (Excepcion2 e2) {
            System.out.println("Se capturó la Excepción2");
        }
    }
}