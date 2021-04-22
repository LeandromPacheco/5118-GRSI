import java.util.ArrayList;

public class In {
    private int idFormando;
    private int idCurso;
    private String nome;
    private String nomef;
    private int idfInscrição;

    public int getIdFormando() {
        return idFormando;
    }
    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
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
    public String getNomef() {
        return nomef;
    }
    public void setNomef(String nomef) {
        this.nomef = nomef;
    }
    public int getIdfInscrição() {
        return idfInscrição;
    }
    public void setIdfInscrição(int idfInscrição) {
        this.idfInscrição = idfInscrição;
    }
    public In(int idFormando, int idCurso, String nome, String nomef, int idfInscrição) {
        this.idFormando = idFormando;
        this.idCurso = idCurso;
        this.nome = nome;
        this.nomef = nomef;
        this.idfInscrição = idfInscrição;
    }
   
    public In() {
    }
    @Override
    public String toString() {
        return "In [idCurso=" + idCurso + ", idFormando=" + idFormando + ", idfInscrição=" + idfInscrição + ", nome="
                + nome + ", nomef=" + nomef + "]";
    }

    
}