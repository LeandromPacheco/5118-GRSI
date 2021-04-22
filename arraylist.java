import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<cursos> osCursos = new ArrayList<>();
    static ArrayList<Disciplinas> asDisciplinas = new ArrayList<>();
    static ArrayList<In> asInscrições = new ArrayList<>();
    static Continuar continuar = new Continuar();
    static int idFormando = 1;
    static int idCurso = 1;
    static int idCDisciplinas = 1;
    static int idfInscrição = 1;

    public static void main(String[] args) {
        int idCurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Formando> lista = new ArrayList<>();
        ArrayList<Disciplinas> lista3 = new ArrayList<>();
        Continuar continuar = new Continuar();
        showMenu menus = new showMenu();
        ArrayList<cursos> lista2 = new ArrayList<>();
        int escolha = 0;
        int escolhasec = 0;
        do {
            escolha = menus.showMenuPrincipal();
            switch (escolha) {
            case 1:
                do {
                    escolhasec = menus.showMenuSecundário("Formando");
                    switch (escolhasec) {
                    case 1:
                        inserirFormando();
                        break;
                    case 2:
                        modificarFormando();
                        break;
                    case 3:
                        eliminarFormando();
                        break;
                    case 4:
                        for (Formando osFormandos : osFormandos) {
                            System.out.println(osFormandos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 2:
                do {
                    escolhasec = menus.showMenuSecundário("Curso");
                    switch (escolhasec) {
                    case 1:
                        inserirCurso();
                        break;
                    case 2:
                        modificarCurso();
                        break;
                    case 3:
                        eliminarCurso();
                        break;
                    case 4:
                        for (cursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;

            case 3:
                do {
                    escolhasec = menus.showMenuSecundário("Inscrições");
                    switch (escolhasec) {
                    case 1:
                        inserirInscrição();
                        break;
                    //case 2:
                      //  modificarInscrição();
                        //break;
                    case 3:
                        eliminarInscrição();
                        break;
                    case 4:
                        for (In asInscrições : asInscrições) {
                            System.out.println(asInscrições.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;

            case 4:
                do {
                    escolhasec = menus.showMenuSecundário("Disciplinas");
                    switch (escolhasec) {
                    case 1:
                        inserirDisciplina();
                        break;
                    case 2:
                        modificarDisciplina();
                        break;
                    case 3:
                        eliminarDisciplina();
                        break;
                    case 4:
                        for (Disciplinas asDisciplinas : asDisciplinas) {
                            System.out.println(asDisciplinas.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            }

        } while (escolha != 9);

    }

    private static void inserirInscrição() {
        Scanner sc = new Scanner(System.in);
        In aInscrições = new In();
        for (cursos osCursos : osCursos) {
            System.out.println(osCursos.toString());
        }
        System.out.println("Id do curso");
        int ID = sc.nextInt();
        aInscrições.setIdCurso(ID);
        for (Formando osFormandos : osFormandos) {
            System.out.println(osFormandos.toString());
        }
        System.out.println("Id do formando");
        int IDF = sc.nextInt();
        aInscrições.setIdFormando(IDF);
        cursos cursos = osCursos.get(ID - 1);
        aInscrições.setNome(cursos.getNome());
        Formando formando = osFormandos.get(IDF - 1);
        aInscrições.setNomef(formando.getNomef());
        asInscrições.add(aInscrições);
    }

    private static void eliminarInscrição() {
        In aInscrições = new In();
        if (asInscrições.size() == 0) {
            System.out.println("Não existe inscrições.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (In aIn : asInscrições) {
                System.out.println(aIn.toString());
            }
            System.out.println("Qual inscrição quer eliminar? (Digite o ID da inscrição)");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisciplinas.size()) {
                if (asDisciplinas.size() == 0) {
                    System.out.println("Não há inscrições!");
                } else {
                    asInscrições.remove(id - 1);
                    idfInscrição = 2;
                    int j = asInscrições.size();
                    for (int x = 2; x < j + 1; x++) {
                        aInscrições = asInscrições.get(x - 1);
                        aInscrições.setIdfInscrição(idfInscrição++);
                    }
                    System.out.println("A inscrição com o ID " + id + " foi eliminado.");
                    for (In d : asInscrições) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhuma inscrição com o ID " + id);
            }
        }
    }

    private static void modificarCurso() {
        int idCurso = 1;
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {
                cursos cursos = osCursos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do Curso:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    cursos.setNome(sc.nextLine());

                System.out.println("Quantas horas:");
                cursos.setHoras(sc.nextInt());

                System.out.println("Disciplinas:");
                cursos.setDisciplinas(sc.nextLine());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void modificarFormando() {
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do formando:");
                formando.setNomef(sc.nextLine());
                if (!nome.isEmpty())
                    formando.setNomef(sc.nextLine());

                System.out.println("Masculino (True/False):");
                formando.setMasculino(sc.nextBoolean());

                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void inserirCurso() {
        Scanner sc = new Scanner(System.in);
        cursos cursos = new cursos();
        Formando formando = new Formando();
        In aInscrições = new In();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idCurso++);
        System.out.println("Nome do Curso:");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        cursos.setHoras(sc.nextInt());
        System.out.println(asDisciplinas.toString());
        System.out.println("Quais disciplinas quer adicionar? (Digite o ID da disciplina):");
        int ID = sc.nextInt();
        aInscrições.setIdfInscrição(idfInscrição);
        osCursos.add(cursos);
    }

    private static void inserirFormando() {
        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idFormando++);
        System.out.println("Nome do formando:");
        formando.setNomef(sc.nextLine());
        System.out.println("Masculino (True/False):");
        formando.setMasculino(sc.nextBoolean());
        System.out.println("Telefone:");
        formando.setTelefones(sc.nextInt());
        osFormandos.add(formando);
    }

    private static void eliminarFormando() {
        Formando formando = new Formando();
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }
            System.out.println("Qual aluno/a quer eliminar? (Digite o ID do aluno/a)");
            int id = sc.nextInt();
            if (id > 0 && id <= osFormandos.size()) {
                if (osFormandos.size() == 0) {
                    System.out.println("Não há Formandos!");
                } else {
                    osFormandos.remove(id - 1);
                    idFormando = 2;
                    int j = osFormandos.size();
                    for (int x = 2; x < j + 1; x++) {
                        formando = osFormandos.get(x - 1);
                        formando.setIdFormando(idFormando++);
                    }
                    System.out.println("O aluno com o ID " + id + " foi eliminado.");
                    for (Formando c : osFormandos) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhum aluno com o ID " + id);
            }
        }
    }

    private static void eliminarCurso() {
        cursos cursos = new cursos();
        if (osCursos.size() == 0) {
            System.out.println("Não existe cursos.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }
            System.out.println("Qual curso quer eliminar? (Digite o ID do Curso)");
            int id = sc.nextInt();
            if (id > 0 && id <= osCursos.size()) {
                if (osCursos.size() == 0) {
                    System.out.println("Não há Cursos!");
                } else {
                    osCursos.remove(id - 1);
                    idCurso = 2;
                    int j = osCursos.size();
                    for (int x = 2; x < j + 1; x++) {
                        cursos = osCursos.get(x - 1);
                        cursos.setIdCurso(idCurso++);
                    }

                    System.out.println("O curso com o ID " + id + " foi eliminado.");
                    for (cursos c : osCursos) {
                        System.out.println(c.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhum curso com o ID " + id);
            }
        }
    }

    private static void modificarDisciplina() {
        Disciplinas disciplinas = new Disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas oDisciplinas : asDisciplinas) {
                System.out.println(oDisciplinas.toString());
            }
            System.out.println("ID da disciplinas:");
            int id = sc.nextInt();
            try {
                Disciplinas oDisciplinas = asDisciplinas.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome da disciplinas:");
                oDisciplinas.setNomeD(sc.nextLine());
                if (!nome.isEmpty())
                    oDisciplinas.setNomeD(sc.nextLine());

                System.out.println("Horas:");
                oDisciplinas.setHorasD(sc.nextInt());

            } catch (Exception e) {
                System.out.println("A disciplina " + id + " não existe");
            }
        }
    }

    private static void inserirDisciplina() {
        Scanner sc = new Scanner(System.in);
        Disciplinas disciplinas = new Disciplinas();
        sc = new Scanner(System.in);
        disciplinas.setIdDisciplina(idCDisciplinas++);
        System.out.println("Nome do disciplina:");
        disciplinas.setNomeD(sc.nextLine());
        System.out.println("Horas:");
        disciplinas.setHorasD(sc.nextInt());
        asDisciplinas.add(disciplinas);
    }

    private static void eliminarDisciplina() {
        Disciplinas disciplinas = new Disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há disciplinas.");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas aDisciplinas : asDisciplinas) {
                System.out.println(aDisciplinas.toString());
            }
            System.out.println("Qual disciplina quer eliminar? (Digite o ID da disciplina)");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisciplinas.size()) {
                if (asDisciplinas.size() == 0) {
                    System.out.println("Não há disciplinas!");
                } else {
                    asDisciplinas.remove(id - 1);
                    idCDisciplinas = 2;
                    int j = asDisciplinas.size();
                    for (int x = 2; x < j + 1; x++) {
                        disciplinas = asDisciplinas.get(x - 1);
                        disciplinas.setIdDisciplina(idCDisciplinas++);
                    }

                    System.out.println("A disciplina com o ID " + id + " foi eliminada.");
                    for (Disciplinas d : asDisciplinas) {
                        System.out.println(d.toString());
                    }
                }
            } else {
                System.out.println("Não existe nenhuma disciplina com o ID " + id);
            }
        }
    }
}