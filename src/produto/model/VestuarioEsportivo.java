package produto.model;

public class VestuarioEsportivo extends Produto {
	
	private String tamanho;
	private String tecido;
	private String indicado_para;

	public VestuarioEsportivo(int codigo, String nome, float preco, int categoria, String marca, String tamanho, String tecido, String indicado_para) {
		super(codigo, nome, preco, categoria, marca);
		
		this.tamanho = tamanho;
		this.tecido = tecido;
		this.indicado_para = indicado_para;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

	public String indicado_para() {
		return indicado_para;
	}

	public void indicado_para(String indicado_para) {
		this.indicado_para = indicado_para;
	}

    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho " + this.tamanho);
		System.out.println("Tecido: " + this.tecido);
		System.out.println("Indicado para: " + this.indicado_para);
	}
}
