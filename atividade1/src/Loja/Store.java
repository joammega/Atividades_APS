package Loja;
import java.util.ArrayList;
public class Store {
	private ArrayList<Product> produtoList;
	private String storeID;
	public Store(String storeID) {
		this.produtoList = new ArrayList<Product>();
		this.storeID = storeID;
	}
	
	public boolean adProduto(String codigo, String desc, double valor, double custo, double lucro, int estoque) {
		this.produtoList.add(new Product(codigo, desc, valor, custo, lucro, estoque));
		return true;
	}
	public boolean venderProduto(String codigo, int qtd) {
		for(int i = 0; i< this.produtoList.size(); i++) {
			if(codigo.equalsIgnoreCase(this.produtoList.get(i).getCodigo())) {
				if(this.produtoList.get(i).getEstoque() >= qtd) {
					this.produtoList.get(i).venda(qtd);
					return true;
				}
			}
		}
		return false;
	}
	public boolean comprarProduto(String codigo, int qtd) {
		for(int i = 0; i< this.produtoList.size(); i++) {
			if(codigo.equalsIgnoreCase(this.produtoList.get(i).getCodigo())) {
				this.produtoList.get(i).compra(qtd);
				return true;
			}
		}
		return false;
	}
	public String consultarProduto(String codigo) {
		for(int i = 0; i< this.produtoList.size(); i++) {
			if(codigo.equalsIgnoreCase(this.produtoList.get(i).getCodigo())) {
				return "O valor é: " + this.produtoList.get(i).calculaPreco();
				
			}
		}
		return "produto não encontrado";
	}
	public String listarProdutos() {
		String toString = "";
		Product produto;
		for(int i = 0; i< this.produtoList.size(); i++) {
			produto = this.produtoList.get(i);
			toString += "Código: "+ produto.getCodigo() + " Descrição: " + produto.getDesc() + " Valor: " + produto.calculaPreco() + "\n";
		}
		return toString;
	}
	
}
