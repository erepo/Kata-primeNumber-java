package kata.primeNumber;

public class NegativeNumberException extends RuntimeException {
	private static final long serialVersionUID = -6093800700695298527L;
	public NegativeNumberException() {
		super();
	}
    public NegativeNumberException(String s){
       super(s);
    }
}
