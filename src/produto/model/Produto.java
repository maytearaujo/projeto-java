package produto.model;

public abstract class Produto {
	private int codigo;
	private String nome;
	private float preco;
	private int categoria;
	private String marca;
	
	public Produto(int codigo, String nome, float preco, int categoria, String marca) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.marca = marca;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void visualizar() {

		String categoria = "";
		
		switch(this.categoria) {
			case 1:
				categoria = "Equipamento Esportivo";
				break;
			
			case 2:
				categoria = "Vestuário Esportivo";
				break;
				
			case 3:
				categoria = "Suplemento Esportivo ";
				break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("Categoria: " + categoria);
		System.out.println("Marca: " + marca);
		
	}








	





}
