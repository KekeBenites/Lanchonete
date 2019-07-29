package lanchonete;
public class Lanche extends Comida{

    public Lanche(String nome, float preco) {
        super(nome, preco);
    }
   
    @Override
    public String toString() {
        return "Lanche = \t" + this.getNome() + " \tR$ " + this.getPreco();
    }
       
       
    

    
    
    
    
}
