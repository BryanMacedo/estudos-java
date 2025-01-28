package javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public void imprime(){
        System.out.println();
        System.out.println("#################################################");
        System.out.println("###### Imprimindo informações do seminário ######");
        System.out.println();
        System.out.println("Titulo do seminário: " + this.titulo);
        System.out.println("Local do seminário: " + local.getEndereco());
        for (Aluno aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno.getNome() + "\nIdade do aluno: " + aluno.getIdade());
        }

    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
