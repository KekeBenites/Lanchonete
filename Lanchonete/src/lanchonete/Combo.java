package lanchonete;
public class Combo {
    
    Lanche lanche;
    Bebida bebida;
    Sobremesa sobremesa;
    float descontoLanche;
    float descontoBebida;
    float descontoSobremesa;

    public Combo(Lanche lanche, Bebida bebida, Sobremesa sobremesa) {
        this.lanche = lanche;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        return "****** Combo ******\n" + lanche + "\n" + bebida + "\n" + sobremesa + "\n" + 
               "Total = \t\tR$ "+(lanche.getPreco()+bebida.getPreco()+sobremesa.getPreco())+ "\n****** Fim ******";
    }
    
    public void total(float precoLanche,float precoBebida, float precoSobremesa){
        
        descontoLanche = lanche.getPreco() * 0.95f;
        descontoBebida = bebida.getPreco() * 0.95f;
        descontoSobremesa = sobremesa.getPreco() * 0.95f;
        
    }
    
     
}
