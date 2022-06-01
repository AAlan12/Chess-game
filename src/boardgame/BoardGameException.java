package boardgame;

public class BoardGameException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public BoardGameException(String msg){
        super(msg);
    }
}
