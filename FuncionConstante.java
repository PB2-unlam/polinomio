
public class FuncionConstante extends Monomio{

	public FuncionConstante(Double coeficiente) {
		super(coeficiente);
	}

	public Double evaluar(Double x){

        return  coeficiente * Math.pow(x, 0);
    }

}
