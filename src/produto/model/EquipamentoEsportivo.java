package produto.model;

public class EquipamentoEsportivo extends Produto {
	
	private String peso;
	private String material;
	private String cor;

	public EquipamentoEsportivo(int codigo, String nome, float preco, int categoria, String marca, String peso, String material, String cor) {
		super(codigo, nome, preco, categoria, marca);
		
		this.peso = peso;
		this.material = material;
		this.cor = cor;		
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Peso: " + this.peso);
		System.out.println("Material: " + this.material);
		System.out.println("Cor: " + this.cor);
	}
	
}
