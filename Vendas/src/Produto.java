import java.io.Serializable;

/**
* A instância dessa classe armazena um produto
*
*/

public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int Codigo;  				//código do produto
	String Nome_do_produto; 	//nome do produto
	String Descricao;  			//descrição do produto
	double Valor_do_produto; 	//valor do produto
	
	/**
	 * Método getCodigo - obtem o código do produto
	 *
	 *@return int - código do produto
	 * */
    public int getCodigo() {
		return Codigo;
	}

	/**
	 * Método setCodigo - atribui um novo código ao produto
	 * 
	 * @param tipo int - código do produto
	 * */
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	/**
	 * Método getNome_do_produto - obtem o nome do produto
	 * @return String - nome do produto
	 * */
	public String getNome_do_produto() {
		return Nome_do_produto;
	}
	/**
	 * Método setNome_do_produto - atribui um novo nome ao produto
	 * 
	 * @param tipo String - nome do produto
	 * */
	public void setNome_do_produto(String nome_do_produto) {
		Nome_do_produto = nome_do_produto;
	}

	/**
	 * Método getDescricao - obtem a descriÃ§Ã£o do produto
	 *
	 *@return String - descrição do produto
	 * */
	public String getDescricao() {
		return Descricao;
	}
	/**
	 * Método setDescricao - atribui uma nova descrição
	 * 
	 * @param tipo String - descrição
	 * */
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	/**
	 * Método getValor_do_produto - obtem o preço do produto
	 *
	 *@return double - preço do produto
	 * */
	public double getValor_do_produto() {
		return Valor_do_produto;
	}
	
	/**
	 * Método setValor_do_produto - atribui um novo preço
	 * 
	 * @param tipo double - preço do produto
	 * */
	public void setValor_do_produto(double valor_do_produto) {
		Valor_do_produto = valor_do_produto;
	}

	/**
	 * Método construtor - atribui um novo preço
	 * 
	 * @param Codigo - tipo int - codigo do produto
	 * @param Nome_do_produto - tipo String - nome do produto
	 * @param Descricao - tipo String - descriÃ§Ã£o do produto
	 * @param Valor_do_produto - tipo double - preÃ§o do produto
	 * */
	public Produto(int Codigo, String Nome_do_produto, String Descricao, double Valor_do_produto){
        this.Codigo = Codigo;
        this.Nome_do_produto = Nome_do_produto;
        this.Descricao = Descricao; 
        this.Valor_do_produto = Valor_do_produto;
   }
}
