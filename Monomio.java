
public class Monomio{
	protected Integer exponente;
    protected Double coeficiente;

    public Monomio(Integer exponente, Double coeficiente) {
        this.exponente = exponente;
        this.coeficiente = coeficiente;
    }

    public Monomio(Double coeficiente) {
    	this.coeficiente = coeficiente;
	}
    
    public Monomio() {
    	}
    
	public Double evaluar(Double x){

        return  coeficiente * Math.pow(x, this.exponente);
    }

}
