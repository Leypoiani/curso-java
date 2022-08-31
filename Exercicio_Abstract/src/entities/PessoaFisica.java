package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastoComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double imposto() {
		if(rendaAnual <= 20000) {
			return (0.15 * rendaAnual) - (0.50 * gastoComSaude);
		}else
			return (0.25 * rendaAnual) - (0.50 * gastoComSaude);
	}

}
