package Exceptions;



    public class Suma {
        public static void main(String[] args) {
            int suma = 0;
            try {
                for (int i = 0; i < args.length; i++)
                    suma += Integer.parseInt(args[i]);
                System.out.print("La suma es:" + suma);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No hay argumentos");
            } catch (NumberFormatException e) {
                System.out.println("Argumento no valido "+ e.getMessage());

            }
        }
    }

