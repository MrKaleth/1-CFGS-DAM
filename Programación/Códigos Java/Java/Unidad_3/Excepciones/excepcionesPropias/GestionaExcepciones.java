package excepcionesPropias;

public class GestionaExcepciones {
	public static void main(String[] args) throws AdrianException {
		try {
			throw new AdrianException("Lanzando mis excepciones.");
		}
		catch(AdrianException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	
	}
}
