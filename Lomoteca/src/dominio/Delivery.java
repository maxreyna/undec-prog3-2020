package dominio;

public class Delivery {
	private String pedido;
	
	public Delivery(String pedido) {
		this.pedido=pedido;
	}
	
	public boolean entregarPedido() {
		return true;
	}
	
	public boolean cobrar() {
		return true;
	}

}
