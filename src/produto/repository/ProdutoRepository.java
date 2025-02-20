package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	// CRUD do Produto
	public void procurarPorNome(int numero);
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int codigo);

}
