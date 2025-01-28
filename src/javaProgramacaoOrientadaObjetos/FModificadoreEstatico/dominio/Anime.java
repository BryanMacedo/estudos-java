package javaProgramacaoOrientadaObjetos.FModificadoreEstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloco de inicialização estático é executado apenas uma vez quando a JVM carregar a classe
    //1 - Alocado espaço em memória para o objeto
    //2 - cada atributo de classe é criado e inicializado com valores default ou oq for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    static { // Bloco de inicialização de instância
        System.out.println("Dentro do bloco de inicialização estático 1");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i+1;
        }
    }
    static { // Bloco de inicialização de instância
        System.out.println("Dentro do bloco de inicialização estático 2");
    }
    static { // Bloco de inicialização de instância
        System.out.println("Dentro do bloco de inicialização estático 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 1");

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
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
