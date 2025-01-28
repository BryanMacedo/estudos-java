package javaSintaxeBasica;

public class Dia09EstruturaCondicionalSwitch {
    public static void main(String[] args) {
        // IMPRIME O DIA DA SEMANA, CONSIDERANDO 1 COMO DOMINGO

        byte dia = 15;
        // tipos aceitados no switch: char,int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }

        char sexo = 'F';
        switch (sexo) {
            case 'M': {
                System.out.println("Sexo masculino");
                break;
            }
            case 'F': {
                System.out.println("Sexo Feminino");
                break;
            }
            default: {
                System.out.println("Opção invalida!");
                break;
            }
        }
    }
}
