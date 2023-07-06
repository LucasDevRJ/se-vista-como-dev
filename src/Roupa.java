public class Roupa {
    protected String nome;
    protected double preco;
    protected String cor;
    protected String tamanho;
    protected String marca;
    protected String descricao;

    public Roupa(String nome, double preco, String cor,
                 String tamanho, String marca, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.descricao = descricao;
    }
}
