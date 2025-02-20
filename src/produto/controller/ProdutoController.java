package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollectionNumero(numero);
		
		if ( produto != null)
			produto.visualizar();
		else
			System.out.println("\n produto número: " + numero + " não foi encontrado!");
		
	}
	
	@Override
	public void procurarPorNome(String nome) {
		var produto = buscarNaCollectionNome(nome);
		
		if ( produto != null)
			produto.visualizar();
		else
			System.out.println("\n produto de nome: " + nome + " não foi encontrado!");
		
	}

	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nA Produto: " + produto.getNome() + " foi cadastradocom sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollectionNumero(produto.getCodigo());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nProduto de código: " + produto.getCodigo() + " atualizado com sucesso!");	
		} else
			System.out.println("\nProduto de código: " + produto.getCodigo() + " não foi encontrado!");		
	}

	@Override
	public void deletar(int codigo) {
		var conta = buscarNaCollectionNumero(codigo);
		
		if (conta != null) {
			if(listaProdutos.remove(conta) == true)
				System.out.println("\nO Produto de código: " + codigo + " foi deletada com sucesso!");
		}else
			System.out.println("\nA Conta numero: " + codigo + " não foi encontrada!");			
	}

	public int gerarNumero() {
		return ++numero;
	}
	
	public Produto buscarNaCollectionNumero(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == numero) {
				return produto;
			}
		}
		
		return null;
	}
	
	public Produto buscarNaCollectionNome(String nome) {
		for (var produto : listaProdutos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		
		return null;
	}
}
