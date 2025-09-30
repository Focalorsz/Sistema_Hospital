import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Medico extends Pessoa{
    private String Especialidade;
    private String CRM;
    private Integer NumeroConsultas;
    private Integer CustoConsulta;
    private LocalDateTime AgendaHorarios;

    public Medico(String nome,String cpf,String Especialidade, String CRM, Integer CustoConsulta, LocalDateTime AgendaHorarios) {
        super();
        this.Especialidade = Especialidade;
        this.CRM = CRM;
        this.NumeroConsultas = 0;
        this.CustoConsulta = CustoConsulta;
        this.AgendaHorarios = AgendaHorarios;
    }
    public String getEspecialidade() {
        return Especialidade;
    }
    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }
    public String getCRM (){
        return CRM;
    }
    public void setCRM(String crm) {
        this.CRM = crm;
    }
    public LocalDateTime getAgendaHorarios() {
        return AgendaHorarios;
    }
    public void setAgendaHorarios(LocalDateTime AgendaHorarios) {
        this.AgendaHorarios = AgendaHorarios;
    }
    public Integer getNumeroConsultas() {
        return NumeroConsultas;
    }
    public void setNumeroConsultas(Integer NumeroConsultas) {
        NumeroConsultas = numeroconsultas;
    }
    public Integer getCustoConsulta() {
        return CustoConsulta;
    }
    public void setCustoConsulta(Integer CustoConsulta) {
        this.CustoConsulta = custoconsulta;
    }
}