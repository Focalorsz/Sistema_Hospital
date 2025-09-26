public class Pessoa{
    protected String nome;//atributo protected para ter acesso somente dentro do mesmo pacote e por classes filhas.
    protected String cpf; //se colocar como int alguns numeros como 0 são desconsiderados então deixa string mesmo
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }//cria um metódo que recebe os atributos do nome e do cpf

    //Getters e Setters
    public String getNome() {return nome; } //recebe o nome e retorna o nome
    public void setNome(String nome) { this.nome = nome; } //atribui o valor de nome como sendo o nome da pessoa

    public String getCpf() {return cpf; }//recebe o cpf e retorna o nome
    public void setCpf(String cpf) { this.cpf = cpf; }//atribui o valor de cpf como sendo o nome da pessoa

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
