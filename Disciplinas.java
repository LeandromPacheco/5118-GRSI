import java.util.ArrayList;

public class Disciplinas {
    private String nomeD;
    private int idDisciplina;
    private int HorasD;

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getHorasD() {
        return HorasD;
    }

    public void setHorasD(int horasD) {
        HorasD = horasD;
    }

    public Disciplinas() {
        this.nomeD = nomeD;
        this.idDisciplina = idDisciplina;
        this.HorasD = HorasD;
    }

    @Override
    public String toString() {
        return "Disciplinas [HorasD=" + HorasD + ", idDisciplina=" + idDisciplina + ", nomeD=" + nomeD + "]";
    }

}