package javaProgramacaoOrientadaObjetos.ZZAclassesInternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    // Nested
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outer = new OuterClassesTest01();
        Inner inner = outer.new Inner();

        Inner inner2 = new OuterClassesTest01().new Inner();

        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();

    }
}





































