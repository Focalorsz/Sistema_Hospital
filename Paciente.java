public class Paciente extends Pessoa{
    private String Telefone;
    private String HistoricoConsultas;
    private Integer Idade;
    private Integer NumeroInternacoes;

    public Paciente(String Telefone, String HistoricoConsultas, Integer Idade, Integer NumeroInternacoes) {
        this.Telefone = Telefone;
        this.HistoricoConsultas = HistoricoConsultas;
        this.Idade = Idade;
        this.NumeroInternacoes = NumeroInternacoes;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public String getHistoricoConsultas() {
        return HistoricoConsultas;
    }
    public void setHistoricoConsultas(String HistoricoConsultas) {
        this.HistoricoConsultas = HistoricoConsultas;
    }
    public Integer getIdade () {
        return Idade;
    }
    public void setIdade(Integer idade) {
        Idade= idade;
    }
    public Integer getNumeroInternacoes() {
        return NumeroInternacoes;
    }
    public void setNumeroInternacoes(Integer NumeroInternacoes) {
        this.NumeroInternacoes = NumeroInternacoes;
    }
}