package Estoque;

public class ProdutoLimpeza extends Produto {

	private static final long serialVersionUID = 1483652216205491933L;
	
	private String aplicacao;
	private String tipo;

	public ProdutoLimpeza(int Codigo, String Nome_do_produto, String Descricao,
			double Valor_do_produto, String aplicacao, String tipo) {
		super(Codigo, Nome_do_produto, Descricao, Valor_do_produto);
		this.aplicacao = aplicacao;
		this.tipo = tipo;
	}

	public String getAplicacao() {
		return aplicacao;
	}

	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
