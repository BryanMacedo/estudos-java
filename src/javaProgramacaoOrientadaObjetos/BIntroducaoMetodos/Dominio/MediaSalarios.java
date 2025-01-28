package javaProgramacaoOrientadaObjetos.BIntroducaoMetodos.Dominio;

public class MediaSalarios {

    public void mediaSalarios(Funcionario funcionario){
        double salarioTotal = 0;
        if (funcionario.getSalarios() == null) {
            return;
        }
        for (int i = 0; i < funcionario.getSalarios().length; i++) {
            salarioTotal += funcionario.getSalarios()[i];
        }
        double media = salarioTotal / funcionario.getSalarios().length;
        System.out.println("A média salarial é de: R$ " + media);
    }
}














