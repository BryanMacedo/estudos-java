package javaProgramacaoOrientadaObjetos.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Zoro";
    static class Nested {
        private String lastName = "Roronoa";
        void print(){
            System.out.println(lastName + " " + new OuterClassesTest03().name);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}

















