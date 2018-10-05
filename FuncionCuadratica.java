
public class FuncionCuadratica extends Monomio{
	

	public FuncionCuadratica(Double coeficiente) {
		super(coeficiente);
	}

	public Double evaluar(Double x){

        return  coeficiente * Math.pow(x, 2);
    }


}
