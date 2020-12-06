import Loja.Store;
import java.util.Scanner;


public class Main {
	
	private static Scanner myc = new Scanner(System.in);
	private static Scanner myc2 = new Scanner(System.in);
	private static Store loja = new Store("loja1");
	
	public static String controller(String c) {
		String res = "comando inválido";
		
		if(c.equalsIgnoreCase("help")) {
			res = "Digite o número da função desejada: \n"
					+ "1.CriarProduto \n"
					+ "2.ComprarProduto \n"
					+ "3.VenderProduto \n"
					+ "4.ConsultarProduto \n"
					+ "5.Listar Produtos \n";
		}
		else if(c.equalsIgnoreCase("1")) {
			System.out.println("Digite o código do produto: ");
		    String codigo = myc2.next();
		    
		    System.out.println("Digite a descrição do produto: ");
		    String descricao = myc2.nextLine();
		    descricao = myc2.nextLine();
		    
		    System.out.println("Digite o valor do produto: ");
		    double valor = myc2.nextDouble();
		    
		    System.out.println("Digite o custo do produto: ");
		    double custo = myc2.nextDouble();
		    
		    System.out.println("Digite o lucro do produto: ");
		    double lucro = myc2.nextDouble();
		    
		    System.out.println("Digite o estoque do produto: ");
		    int estoque = myc2.nextInt();
		    if(loja.adProduto(codigo, descricao, valor, custo, lucro, estoque)) {
		    	res = "Produto add com sucesso";
		    }else {
		    	res = "erro ao add produto";
		    }
		}else if(c.equalsIgnoreCase("2")) {
			System.out.println("Digite o código do produto: ");
		    String codigo = myc2.next();
		    
		    System.out.println("Digite a quantidade do produto: ");
		    int qtd = myc2.nextInt();
		    
		    if(loja.comprarProduto(codigo, qtd)) {
		    	res = "Sua compra foi efetuada com sucesso";
		    }else {
		    	res = "erro ao comprar produto";
		    }
		}else if(c.equalsIgnoreCase("3")) {
			System.out.println("Digite o código do produto: ");
		    String codigo = myc2.next();
		    
		    System.out.println("Digite a quantidade do produto: ");
		    int qtd = myc2.nextInt();
		    
		    if(loja.venderProduto(codigo, qtd)) {
		    	res = "Sua venda foi efetuada com sucesso";
		    }else {
		    	res = "erro ao vender produto";
		    }
		}else if(c.equalsIgnoreCase("4")) {
			System.out.println("Digite o código do produto: ");
		    String codigo = myc2.next();
		    
		    res = loja.consultarProduto(codigo);
		    
		    
		}else if(c.equalsIgnoreCase("5")) {
			res = loja.listarProdutos();
		}
		
		return res;
	}
	
	public static void main(String[] args)  {
		String command = "";
		
		while(!command.equalsIgnoreCase("fim")) {
			
		    
			System.out.println("Digite seu comando ou help: ");
		    
		    
		    command = myc.next();
		    if(command.equalsIgnoreCase("fim")) {
		    	break;
		    }
		    System.out.println(controller(command));
		  
		    
		}
		
		  myc.close();	
		  myc2.close();
		
	 }
}
