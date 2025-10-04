import java.time.LocalDateTime;

public class Medico extends Pessoa{
    private final Especialidade especialidade;
    private String CRM;
    private Integer NumeroConsultas;
    private double CustoConsulta;
    private LocalDateTime AgendaHorarios;

    public Medico(String nome,String cpf,Integer idade,Genero genero,String telefone,Especialidade especialidade, String CRM, Integer CustoConsulta, LocalDateTime AgendaHorarios) {
        super(nome,cpf,idade,genero,telefone);
        this.especialidade = especialidade;
        this.CRM = CRM;
        this.NumeroConsultas = 0;
        this.CustoConsulta = CustoConsulta;
        this.AgendaHorarios = AgendaHorarios;
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
        this.NumeroConsultas = NumeroConsultas;
    }
    public double getCustoConsulta() {
        return CustoConsulta;
    }
    public void setCustoConsulta(double CustoConsulta) {
        this.CustoConsulta = CustoConsulta;
    }
    public Especialidade getEspecialidade() {
        return especialidade;
    }

}