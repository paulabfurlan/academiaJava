package checkpoint02;

public class RangeException extends  Exception{

	private static final long serialVersionUID = 1L;
	
	public RangeException()
    {
        super();
    }
    public RangeException(String mensagem)
    {
        super(mensagem);
    }
    public String toString()
    {
        return "A seguinte exceção ocorreu" + this.getClass().getName() +"\n" +
                " Mensagem: " + this.getMessage() + "\n" ;
    }
}