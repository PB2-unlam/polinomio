import java.util.Arrays;
import java.util.List;

public class Polinomio{
	 private List<Monomio> monomios;

	    public Polinomio(Monomio...monomio) {

	        this.monomios = Arrays.asList(monomio);

	    }

	    public Double resolver(Double x){

	        Double resultado = 0d;

	        for (Monomio unMonomio: monomios) {

	            resultado += unMonomio.evaluar(x);
	        }

	        return resultado;
	    }

}
