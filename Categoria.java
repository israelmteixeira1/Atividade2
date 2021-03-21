package dominio;

public enum Categoria {
	SIMPLES("Simples"),
	EXECUTIVA("Executiva"),
	PREMIUM("Premium"),
	PERSONALITE("Personalite");
	
	private final String categoria;
	
	Categoria(String categoria){
		this.categoria = categoria;
	}
	
	public String getCategoria(){
		return categoria;
	}
}
