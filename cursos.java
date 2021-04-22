import java.util.ArrayList;

public class cursos {
    private int idCurso;
    private String nome;
    private int horas;
    private String disciplinas;
    private Boolean adicionar;

    public cursos(int idCurso, String nome, int horas, String disciplinas, boolean adicionar) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.horas = horas;
        this.disciplinas = disciplinas;
        this.adicionar = adicionar;
    }

    public Boolean getAdicionar() {
        return adicionar;
    }

    public void setAdicionar(Boolean adicionar) {
        this.adicionar = adicionar;
    }

    public cursos(Boolean adicionar) {
        this.adicionar = adicionar;
    }

    public cursos() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "cursos [horas=" + horas + ", idCurso=" + idCurso + ", nome=" + nome + ", disciplinas=" + disciplinas + "]";
    }
}
