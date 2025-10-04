public enum Genero{
    Feminino("Feminino"),//não façam isso num enum, eles devem ser de preferencia maiusculos, percebi isso ao fazer o ENUM de especialidades, uma boa prática é sempre escrever os elementos de um ENUM com letras maiúsculas
    Masculino("Masculino");//mas como eu já havia aplicado a lógica considerando essa formatação então assim continuou.

private final String displayName;//o final é o valor imutável que tá dentro do parênteses

//construtor
private Genero(String displayName) {
    this.displayName = displayName;
    }

    //get
public String getDisplayName() {
    return displayName;
    }
}
