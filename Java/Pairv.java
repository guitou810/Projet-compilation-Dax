/**
 *
 * @author Dax guillaume
 */
public class PairV extends Value{
    private Value fst, snd;
    
    public PairV(Value fst, Value snd){
        this.fst = fst;
        this.snd = snd;
    }
    
    public Value get_first(){return fst;}
    public Value get_snd(){return snd;}
     

    @Override
    void print_value() {
        System.out.print("(");
        fst.print_value();
        System.out.print(",");
        snd.print_value();
        System.out.print(")");
    }
        
    
}