package SO;

public class Frigideira {
    int fri;
    int pan;
    public static int func(int fri){
        return fri;
    }
    public int getFri(){
        return fri;
    }
    public void setFri(int fri){
        this.fri = fri;
    }
    public String toString(){
        if(fri== 1){
            return ("A boca do fogão está com " + this.fri + " frigideiras.");
        }
        else if(fri == 2){
            return ("A boca do fogão está com " + this.fri + " frigideiras.");
        }
        else if(fri == pan){
            return ("Não pode haver frigideiras junto com panelas!");
        }
        else   
            return (this.fri + " É uma quantidade inválida");
    }
}