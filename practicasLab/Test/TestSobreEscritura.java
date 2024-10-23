package Test;

public class TestSobreEscritura {

    @Override
    public String toString() {
        return super.toString() + " TestSobreEscritura{ 'Overrride'  }";
    }


    public static class TestDeprecated {
        @Deprecated
        public void hacer() {
            System.out.println("Testeando: 'Deprecated'");
        }
    }
    public class TestAnotaciones {

        public void main(String[] arg) throws Exception {
            new TestAnotaciones().testearYa();
        }
        @SuppressWarnings({"deprecation"})
        public void testearYa() {
            TestDeprecated t2 = new TestDeprecated();
            t2.hacer();
        }
    }




}
