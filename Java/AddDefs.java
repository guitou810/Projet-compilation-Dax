import java.util.LinkedList;

/**
 *
 * @author Dax guillaume
 */
public class AddDefs extends Instr{
    private final LinkedList<Pair<String, LinkedList<Instr>>> defs;
    
    public AddDefs(LinkedList<Pair<String, LinkedList<Instr>>> defs){
        this.defs = defs;
    }
    
    @Override
    void exec_instr(Config cf) {
        LinkedList<Pair<String, LinkedList<Instr>>> env = cf.get_env();
        defs.addAll(env);
        
        cf.set_env(defs);
        
        cf.get_code().pop();
    }
    
}