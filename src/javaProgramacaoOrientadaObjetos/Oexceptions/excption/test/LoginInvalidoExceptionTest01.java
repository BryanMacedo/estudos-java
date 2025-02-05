package javaProgramacaoOrientadaObjetos.Oexceptions.excption.test;

import javaProgramacaoOrientadaObjetos.Oexceptions.excption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);

        String usernameDB = "nami";
        String passwordDB = "lovBelly";

        System.out.print("Usuário: ");
        String usernameDigitado = sc.nextLine();

        System.out.print("Senha: ");
        String passwordDigitado = sc.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Login ou senha inválida!!");

        }

        System.out.println("Usuário logado com sucesso!!");

    }
}













