package javaProgramacaoOrientadaObjetos.EBlocosDeInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocado espaço em memória para o objeto
    //2 - cada atributo de classe é criado e inicializado com valores default ou oq for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    { // Bloco de inicialização de instância
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
