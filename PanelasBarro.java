package SO;

public class PanelasBarro {
    int fri;
    int pan;
    public static int func(int pan){
        return pan;
    }
    public int getPan(){
        return pan;
    }
    public void setPan(int pan){
        this.pan = pan;
    }
    public String toString(){
        if(pan == 1){
            return ("A boca do fogão está com " + this.pan + " panelas.");
        }
        else if(pan == 2){
            return ("A boca do fogão está com " + this.pan + " panelas");
        }
        else if(fri == pan){
            return ("Não pode haver frigideiras junto com panelas!");
        }
        else 
            return (this.pan + " É uma quantidade inválida");
    }
}