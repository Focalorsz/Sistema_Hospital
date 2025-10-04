public enum planoSaude {
    PLANO_BASICO("Plano Básico", 30, 0.25),
    PLANO_MEDIO("Plano Médio", 50, 0.5),
    PLANO_AVANCADO("Plano Avançado", 70, 0.75); 

    // Declaramos os Campos
    private final String nomePlano;
    private final float preco;
    private final double percentual;

    // Construtor deve ser privado para receber todos os parâmetros necessários
    private planoSaude(String nomePlano, float preco, double percentual) {
        this.nomePlano = nomePlano;
        this.preco = preco;
        this.percentual = percentual;
    }

    // Get
    public String getNomePlano() {
        return nomePlano;
    }

    public float getPreco() {
        return preco;
    }

    public double getPercentual() {
        return percentual;
    }

    // Método que busca um plano pelo seu nome
    public static planoSaude /*classe*/ fromNome(String nome) {
        for (planoSaude plano : values()) {
            if (plano.getNomePlano().equalsIgnoreCase(nome)/*pega o nome do plano e ignora o case sensitive na busca*/) {
                return plano;
            }
        }
        // Exceção se o nome não for encontrado
        throw new IllegalArgumentException("Nenhum plano encontrado com o nome: " + nome);
    }
}