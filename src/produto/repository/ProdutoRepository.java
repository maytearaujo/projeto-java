package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	// CRUD do Produto
	public void procurarPorNumero(int numero);
	public void procurarPorNome(String nome);	
	public void listarProdutos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int codigo);

}
