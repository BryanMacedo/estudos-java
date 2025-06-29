package javaProgramacaoOrientadaObjetos.ZZAclassesInternas.test;

public class OuterClassesTest02 {
    private String name = "Zoro";

    void print(){
        final String lastName = "Roronoa";
        class LocalClass {
            public void printLocal(String param){
                System.out.println(param);
                System.out.println(lastName + " " + name);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal(new String("Monkey D. Luffy"));
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}




























