package contaCorrente;

public class TestaCliente {
	
	public static void main(String[] args) {
		
	
	Cliente c1 = new Cliente();
	c1.nome = "Cristian Fernandes";
	c1.codigo = 2;
	
	Cliente c2 = new Cliente ();
	c2.nome = "Maicon";
	c2.codigo = 3;
	
	System.out.println("Dados do primeiro Cliente");
	System.out.println("Nome:" +c1.nome);
	System.out.println("Código:"+c1.codigo);
	
	System.out.println("-----------------------------");
	
	System.out.println("Dados do segundo cliente");
	System.out.println("Nome:"+c2.nome);
	System.out.println("Código:"+c2.codigo);
}
}