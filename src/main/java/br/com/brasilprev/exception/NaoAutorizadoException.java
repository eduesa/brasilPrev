package br.com.brasilprev.exception;

public abstract class NaoAutorizadoException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1719343948965155727L;

	public NaoAutorizadoException() {
		super("Acesso não autorizado!");
	}

	public NaoAutorizadoException(String string) {
		super(string);
	}

	public NaoAutorizadoException(String string, Throwable causa) {
		super(string, causa);
	}

}
