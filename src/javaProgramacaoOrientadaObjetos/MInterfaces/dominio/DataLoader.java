package javaProgramacaoOrientadaObjetos.MInterfaces.dominio;

public interface DataLoader {
    int MX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
