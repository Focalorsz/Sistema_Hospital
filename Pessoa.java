public class Pessoa{
    protected String nome;//atributo protected para ter acesso somente dentro do mesmo pacote (pasta) e por classes filhas.
    protected String cpf; //se colocar como int alguns numeros como 0 são desconsiderados então por isso o recomendado é string mesmo
    protected Integer idade;
    protected Genero genero;//aqui ele faz uma associação com o enum genero
    public String telefone;//mema coisa do cpf,deixei público pq vai geral usar

    //construtor com os parâmentros
    public Pessoa(String nome, String cpf,Integer idade,Genero genero,String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.telefone = telefone;
    }

    //Getters e Setters pra fazer o encapsulamento
    public String getNome() {return nome; } //recebe o nome e retorna o nome
    public void setNome(String nome) { this.nome = nome; } //atribui o valor de nome como sendo o nome da pessoa

    public String getCpf() {return cpf; }//recebe o cpf e retorna o nome
    public void setCpf(String cpf) { this.cpf = cpf; }//atribui o valor de cpf como sendo o nome da pessoa

    public Integer getIdade() {return idade; }//recebe o cpf e retorna o nome
    public void setIdade(Integer idade) { this.idade = idade; }//atribui o valor de cpf como sendo o nome da pessoa

    public String getTelefone() {return telefone; }//recebe o cpf e retorna o nome
    public void setTelefone(String telefone) { this.telefone = telefone; }//atribui o valor de cpf como sendo o nome da pessoa


    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}