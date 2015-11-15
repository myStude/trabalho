package Estoque;

import java.io.Serializable;

/**
* A inst�ncia dessa classe armazena um produto
*
*/

public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int Codigo;  				//c�digo do produto
	String Nome_do_produto; 	//nome do produto
	String Descricao;  			//descri��o do produto
	double Valor_do_produto; 	//valor do produto
	
	/**
	 * M�todo getCodigo - obtem o c�digo do produto
	 *
	 *@return int - c�digo do produto
	 * */
    public int getCodigo() {
		return Codigo;
	}

	/**
	 * M�todo setCodigo - atribui um novo c�digo ao produto
	 * 
	 * @param tipo int - c�digo do produto
	 * */
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	/**
	 * M�todo getNome_do_produto - obtem o nome do produto
	 * @return String - nome do produto
	 * */
	public String getNome_do_produto() {
		return Nome_do_produto;
	}
	/**
	 * M�todo setNome_do_produto - atribui um novo nome ao produto
	 * 
	 * @param tipo String - nome do produto
	 * */
	public void setNome_do_produto(String nome_do_produto) {
		Nome_do_produto = nome_do_produto;
	}

	/**
	 * M�todo getDescricao - obtem a descrição do produto
	 *
	 *@return String - descri��o do produto
	 * */
	public String getDescricao() {
		return Descricao;
	}
	/**
	 * M�todo setDescricao - atribui uma nova descri��o
	 * 
	 * @param tipo String - descri��o
	 * */
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	/**
	 * M�todo getValor_do_produto - obtem o pre�o do produto
	 *
	 *@return double - pre�o do produto
	 * */
	public double getValor_do_produto() {
		return Valor_do_produto;
	}
	
	/**
	 * M�todo setValor_do_produto - atribui um novo pre�o
	 * 
	 * @param tipo double - pre�o do produto
	 * */
	public void setValor_do_produto(double valor_do_produto) {
		Valor_do_produto = valor_do_produto;
	}

	/**
	 * M�todo construtor - atribui um novo pre�o
	 * 
	 * @param Codigo - tipo int - codigo do produto
	 * @param Nome_do_produto - tipo String - nome do produto
	 * @param Descricao - tipo String - descrição do produto
	 * @param Valor_do_produto - tipo double - preço do produto
	 * */
	public Produto(int Codigo, String Nome_do_produto, String Descricao, double Valor_do_produto){
        this.Codigo = Codigo;
        this.Nome_do_produto = Nome_do_produto;
        this.Descricao = Descricao; 
        this.Valor_do_produto = Valor_do_produto;
   }
}
