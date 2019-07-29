
package lanchonete;

public class Sobremesa extends Comida{

    public Sobremesa(String nome, float preco) {
        super(nome, preco);
    }
        @Override
    public String toString() {
        return "Sobremesa = \t" + this.getNome() + "\tR$ " + this.getPreco();
    }
}
