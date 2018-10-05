
public class FuncionLineal extends Monomio{
	

	public FuncionLineal(Double coeficiente) {
		super(coeficiente);
	}
	@Override
	public Double evaluar(Double x){

        return  coeficiente * Math.pow(x, 1);
    }


}
