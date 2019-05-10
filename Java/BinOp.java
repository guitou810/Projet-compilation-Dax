/**
 *
 * @author Dax guillaume
 */
public class BinOp extends Instr {

    public static enum operateur{Add,Sub,Mult,Div,Mod, //BArith
                                Eq,Ge,Gt,Le,Lt,Ne};     //BCompar
    
    private final operateur op;
    public BinOp(operateur op){
        this.op = op;
    }
    
    @Override
    public void exec_instr(Config cf){
        PairV pair = (PairV)cf.get_value();
        
        Value valeur = null;
        
        switch(op){
            case Add:
            case Sub:
            case Mult:
            case Div:
            case Mod: 
                valeur = new IntV(operArith((IntV) pair.get_first(),(IntV)pair.get_snd()));
                break;

            case Eq:
            case Ge:
            case Gt:
            case Le:
            case Lt:
            case Ne:
                valeur = new BoolV(operComp((IntV) pair.get_first(), (IntV) pair.get_snd()));
                break;
             
            default:
                System.out.println("OPERATEUR INCONNU");
        }

        cf.set_value(valeur);
        cf.get_code().pop();
    }
    
    public int operArith(IntV a, IntV b){
        switch(op){
            case Add: return a.get_int() + b.get_int();
            case Sub: return a.get_int() - b.get_int();
            case Mult: return a.get_int() * b.get_int();
            case Div: return a.get_int() / b.get_int();
            case Mod: return a.get_int() % b.get_int();
            default: 
                System.out.println("ERREUR De COMPILATION BINOP operArith");
                return 0;
        }
    }
    

    public boolean operComp(IntV a, IntV b) {
        switch(op){
            case Eq: return a.get_int() == b.get_int();
            case Ge: return a.get_int() >= b.get_int();
            case Gt: return a.get_int() > b.get_int();
            case Le: return a.get_int() <= b.get_int();
            case Lt: return a.get_int() < b.get_int();
            case Ne: return a.get_int() != b.get_int();
            default:
                System.out.println("ERREUR De COMPILATION BINOP operComp");
                return false;
        }
        
        

    }
}