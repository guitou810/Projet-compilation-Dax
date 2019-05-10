/**
 * Classe pour la création de tuples (ou couples)
 * @author Benjamin Bardy
 */
public class Pair<F, S> {
    private F fst;
    private S snd;
    
    public Pair(F fst, S snd){
        this.fst = fst;
        this.snd = snd;
    }
    
    public F get_first(){return fst;}
    
    public S get_second(){return snd;}
    
    
}