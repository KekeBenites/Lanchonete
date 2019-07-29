
package lanchonete;

public class Comida {
    
    public Comida(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
        
    }
    
    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Comida = " + this.getNome() + " R$ " + this.getPreco();
    }
    
    
    
    
}
