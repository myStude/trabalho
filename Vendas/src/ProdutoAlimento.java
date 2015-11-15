
public class ProdutoAlimento extends Produto {

	private static final long serialVersionUID = -4483678183075145928L;
	
	private String tipoDeDieta;
	private String ingredientes;

	public ProdutoAlimento(int Codigo, String Nome_do_produto,
			String Descricao, double Valor_do_produto, String tipoDeDieta, String ingredientes) {
		super(Codigo, Nome_do_produto, Descricao, Valor_do_produto);
		this.tipoDeDieta = tipoDeDieta;
		this.ingredientes = ingredientes;
	}

	public String getTipoDeDieta() {
		return tipoDeDieta;
	}

	public void setTipoDeDieta(String tipoDeDieta) {
		this.tipoDeDieta = tipoDeDieta;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
