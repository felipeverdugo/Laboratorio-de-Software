package Test;

public class Main {


    public static void main(String[] args) {
    TestSobreEscritura test = new TestSobreEscritura();
    System.out.println(test.toString());
    TestSobreEscritura.TestAnotaciones  testAnotaciones = new TestSobreEscritura().new TestAnotaciones();
    testAnotaciones.testearYa();


    }
}
