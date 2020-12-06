package Loja;

public class Product {
	private String codigo;
	private String desc;
	private double valor;
	private double custo;
	private double lucro;
	private int estoque;
	
	public Product(String codigo, String desc, double valor, double custo, double lucro, int estoque) {
		this.setCodigo(codigo);
		this.setDesc(desc);
		this.valor = valor;
		this.custo = custo;
		this.lucro = lucro;
		this.setEstoque(estoque);
	}
	public void  compra (int quant) {
		this.setEstoque(this.getEstoque() +quant);
	}
	public void  venda (int quant) {
		this.setEstoque(this.getEstoque() - quant);
	}
	public double calculaPreco() {
		return this.valor + this.custo + (this.lucro * (this.valor + this.custo));
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
