package javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.test;

import javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.dominio.Aluno;
import javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.dominio.Local;
import javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.dominio.Professor;
import javaProgramacaoOrientadaObjetos.GAssociacao.ExercicioAssociacao.dominio.Seminario;

import java.util.Scanner;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Local local = new Local();
        Aluno aluno01 = new Aluno();
        Aluno[] alunos = {aluno01};
        Professor professor01 = new Professor();
        Seminario seminario = new Seminario();
        Seminario[] seminarios = {seminario};

        System.out.println("-------------------------------------------------");
        System.out.println("---- Cadastrando informações de um seminário ----");
        System.out.println();

        System.out.print("Informe o nome do local do seminário: ");
        local.setEndereco(sc.nextLine());

        System.out.print("Informe o nome do aluno: ");
        aluno01.setNome(sc.nextLine());
        System.out.print("Informe a idade do aluno: ");
        aluno01.setIdade(sc.nextInt());

        sc.nextLine();
        System.out.print("Informe o nome do professor: ");
        professor01.setNome(sc.nextLine());
        System.out.print("Informe a especialidade do professor: ");
        professor01.setEspecialidade(sc.nextLine());

        System.out.print("Informe o titulo do seminário: ");
        seminario.setTitulo(sc.nextLine());

        seminario.setLocal(local);
        seminario.setAlunos(alunos);
        aluno01.setSeminario(seminario);
        professor01.setSeminarios(seminarios);

        System.out.println();
        System.out.println("---------------Fim do cadastro ------------------");
        System.out.println("-------------------------------------------------");

        seminario.imprime();
        professor01.imprime();
        
        sc.close();
    }
}
