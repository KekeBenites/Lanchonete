package lanchonete;
public class Bebida extends Comida {

    public Bebida(String nome, float preco) {
        super(nome, preco);
    }
    
        @Override
    public String toString() {
        return "Bebida = \t" + this.getNome() + " \tR$ " + this.getPreco();
    }
}
