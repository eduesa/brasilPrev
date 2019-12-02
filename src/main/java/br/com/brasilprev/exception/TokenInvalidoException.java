package br.com.brasilprev.exception;

public class TokenInvalidoException extends NaoAutorizadoException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2937717708400884471L;

	public TokenInvalidoException() {
		super("Não é permitido acesso o recurso: Token inválido!");
	}

	public TokenInvalidoException(String string) {
		super(string);
	}

	public TokenInvalidoException(String string, Throwable causa) {
		super(string, causa);
	}

}
