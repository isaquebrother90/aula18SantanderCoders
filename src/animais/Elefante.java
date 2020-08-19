package animais;

public class Elefante extends Animal {
	
	private Integer tamanhoTromba;
	
	public Elefante() {
		super();
	}

	public Elefante(int quantidadeDePatas, String cor, String classificacao, Integer tamanhoTromba) {
		super(quantidadeDePatas, cor, classificacao);
		this.tamanhoTromba = tamanhoTromba;
	}

	public Integer getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(Integer tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	public void mudaCor() {
		this.cor = "Preto";
	}
	
	@Override
	public void correr() {
		System.out.println("Correndo...");
	}
	
	

}
