package br.com.carro;

public class Main {
    public static void main (String [] args) {
    	Veiculo v1 = new Veiculo ();
    	v1.setMarca("honda");
    	v1.setModelo("city");
    	v1.setPlaca("FAM4334");
    	v1.setCor("cinza");
    	v1.setLigado(true);
    	v1.setLitroscombustivel(10);
    	v1.setPreco(30.00);
    	v1.acelerar();
        v1.abastecer(50);
    	v1.frear();
    	v1.getVelocidade();
    	v1.pintar("preto");
    	v1.status ();
    			
    }
}
