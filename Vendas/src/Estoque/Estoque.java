package Estoque;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * 
 * @author Anderson Franco
 *
 */

public class Estoque {
	private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	/**
	 * Retorna a lista de produtos
	 * @return ArrayList<Produto> listaDeProdutos
	 */
	public ArrayList<Produto> getListaDeProdutos() {
		return this.listaDeProdutos;
	}

	/**
	 * Atribui ou modifica a lista de produtos
	 * @param listaDeProdutos
	 */
	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	
	/**
	 * Imprime a lista na tela
	 * Sem valor de retorno
	 */
	public void imprimirLista() {		
		// Informa o idioma e pais a ser utilizado ao formatar o valor
		Locale ptBr = new Locale("pt","BR");
		// Prepara o formatador com os parametros informados acima
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(ptBr);
		// Imprime a lista na tela
		for(Produto prod: listaDeProdutos) {
			System.out.println(prod.getCodigo() + " " + prod.getNome_do_produto() + " " + numberFormat.format(prod.getValor_do_produto()));
		}
		System.out.println("");
	}
	
	/**
	 * Inclui um produto usando a classe ProdutoLimpeza
	 * @param Codigo
	 * @param Nome_do_produto
	 * @param Descricao
	 * @param Valor_do_produto
	 * @param aplicacao
	 * @param tipo
	 */
	public void incluirProdutoLimpeza(int Codigo, String Nome_do_produto, String Descricao,
			double Valor_do_produto, String aplicacao, String tipo) {
		listaDeProdutos.add(new ProdutoLimpeza(Codigo, Nome_do_produto, Descricao, Valor_do_produto, aplicacao, tipo));
	}
	
	/**
	 * Inclui um produto usando a classe ProdutoAlimento
	 * @param Codigo
	 * @param Nome_do_produto
	 * @param Descricao
	 * @param Valor_do_produto
	 * @param tipoDeDieta
	 * @param ingredientes
	 */
	public void incluirProdutoAlimento(int Codigo, String Nome_do_produto,
			String Descricao, double Valor_do_produto, String tipoDeDieta, String ingredientes) {
		listaDeProdutos.add(new ProdutoAlimento(Codigo, Nome_do_produto, Descricao, Valor_do_produto, tipoDeDieta, ingredientes));
	}
	
	/**
	 * Pesquisa um produto pelo codigo e retorna seu indice na lista de produtos
	 * @param codigo
	 * @return int indice
	 */
	public int getProdutoIndice(int codigo) {
		int posicaoAtual = 0;
		int posicaoProd = -1;
		for(Produto prod: listaDeProdutos) {
			if (prod.getCodigo() == codigo) {
				posicaoProd = posicaoAtual;
				break;
			}
			posicaoAtual++;
		}
		return posicaoProd;
	}

	/**
	 * Exclui um produto pelo codigo
	 * @param codigo
	 */
	public void excluirProduto(int codigo) {
		int indice = getProdutoIndice(codigo);
		if (indice >= 0) {
			listaDeProdutos.remove(indice);
		}
	}
	
	/**
	 * Pesquisa um produto pelo codigo e o retorna se encontrado
	 * @param codigo
	 * @return Produto ou null se o codigo nao existir
	 */
	public Produto getProduto(int codigo) {
		int indice = getProdutoIndice(codigo);
		if (indice >= 0) {
			return listaDeProdutos.get(indice);
		} else {
			return null;
		}
	}
	
	/**
	 * Modifica e/ou substitui um produto da lista
	 * @param codigo
	 * @param prod
	 */
	public void editarProduto(int codigo, Produto prod) {
		int indice = getProdutoIndice(codigo);
		if (indice >= 0) {
			listaDeProdutos.set(indice, prod);
		}
	}
	
	/**
	 * Salva a lista de produtos em arquivo
	 * @param arquivo
	 */
	public void salvarLista(String arquivo) {		
		try {
			File file = new File(arquivo);
			FileOutputStream outFileStream = new FileOutputStream(file);
			ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
			outObjectStream.writeObject(getListaDeProdutos());
			outObjectStream.close();
			System.out.println("Lista salva com sucesso em " + arquivo + ".");
		} catch (Exception e) {
			System.out.println("Erro ao salvar a lista.");
		}
		System.out.println("");
	}

	/**
	 * Carrega a lista de produtos de um arquivo
	 * @param arquivo
	 */
	@SuppressWarnings("unchecked")
	public void carregarLista(String arquivo) {
		try {
			File file = new File(arquivo);
			FileInputStream inFileStream = new FileInputStream(file);
			ObjectInputStream inInputStream = new ObjectInputStream(inFileStream);
			setListaDeProdutos((ArrayList<Produto>) inInputStream.readObject());
			inInputStream.close();
			System.out.println("Lista carregada com sucesso de " + arquivo + ".");
		} catch (Exception e) {
			System.out.println("Erro ao carregar a lista.");
		}
		System.out.println("");
	}
        
        public static void main(String[] args) {
            formEstoque frm = new formEstoque();            
            frm.setVisible(true);
        }

}
