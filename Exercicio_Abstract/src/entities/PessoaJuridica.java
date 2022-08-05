package entities;

public class PessoaJuridica extends Contribuinte{
	
	protected Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}
	public Integer getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	@Override
	public Double imposto() {
		if(funcionarios <= 10) {
			return (0.16 * rendaAnual);
		}else
			return (0.14 * rendaAnual);
	}
	
}
