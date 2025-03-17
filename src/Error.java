public class Error{
    private String message;
    private int ln;
    private int cl;

    public Error(String newMessage, int newLn, int newCl){
        this.setMessage(newMessage);
        this.setLn(newLn);
        this.setCl(newCl);
    }

    public String getMessage(){
        return this.message;
    }

    public int getLn(){
        return this.ln;
    }

    public int getCl(){
        return this.cl;
    }

    public void setMessage(String newMessage){
        this.message = newMessage;
    }

    public void setLn(int newLn){
        this.ln = newLn;
    }

    public void setCl(int newCl){
        this.cl = newCl;
    }
}