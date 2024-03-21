package projetoFinale;

public class Mercadoria {
    private String categoriaProduto;
    private int quantidade;

    public Mercadoria(String produto, int quantidade) {

        this.categoriaProduto = produto;
        this.quantidade = quantidade;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void acomuladorQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    
}