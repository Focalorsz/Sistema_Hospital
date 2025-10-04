public class Paciente extends Pessoa{
    private String HistoricoConsultas;
    private Integer NumeroInternacoes;
    private planoSaude plano;

    public Paciente(String nome, String cpf,String telefone, String HistoricoConsultas, Integer idade, Integer NumeroInternacoes,Genero genero,planoSaude plano) {
        super(nome, cpf, idade, genero,telefone);
        this.HistoricoConsultas = HistoricoConsultas;
        this.NumeroInternacoes = NumeroInternacoes;
        this.plano = plano;
    }
    public String getHistoricoConsultas() {
        return HistoricoConsultas;
    }
    public void setHistoricoConsultas(String HistoricoConsultas) {
        this.HistoricoConsultas = HistoricoConsultas;
    }
    public Integer getNumeroInternacoes() {
        return NumeroInternacoes;
    }
    public void setNumeroInternacoes(Integer NumeroInternacoes) {
        this.NumeroInternacoes = NumeroInternacoes;
    }

    public planoSaude getPlano() {
        return plano;
    }

    public void setPlano(planoSaude plano) {
        this.plano = plano;
    }
}