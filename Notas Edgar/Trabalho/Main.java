package Notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Matricular aluno de Matemática");
            System.out.println("2. Matricular aluno de Literatura");
            System.out.println("3. Calcular média do aluno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeMat = scanner.next();
                    System.out.print("Digite as duas notas do aluno (separadas por espaço): ");
                    double[] notasMat = {scanner.nextDouble(), scanner.nextDouble()};
                    aluno = new CursoMatematica(nomeMat, notasMat);
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeLit = scanner.next();
                    System.out.print("Digite as duas notas do aluno (separadas por espaço): ");
                    double[] notasLit = {scanner.nextDouble(), scanner.nextDouble()};
                    System.out.print("Digite o número de obras lidas: ");
                    int obrasLidas = scanner.nextInt();
                    aluno = new CursoLiteratura(nomeLit, notasLit, obrasLidas);
                    break;
                case 3:
                    if (aluno != null) {
                        System.out.println(aluno.getNome() + " - Disciplina: " + aluno.getDisciplina() + " - Média: " + aluno.calculaMedia());
                        if (aluno instanceof CursoLiteratura) {
                            System.out.println("Obras lidas: " + ((CursoLiteratura) aluno).getObrasLidas());
                        }
                    } else {
                        System.out.println("Nenhum aluno foi criado ainda.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
