import java.util.LinkedList;

/**
 *
 * @author Dax guillaume
 */
public class RmDefs extends Instr{
    private final int n;
    
    public RmDefs(int n){
        this.n = n;
    }
	// ne marche pas complètement
    @Override
    void exec_instr(Config cf) {
        LinkedList<Pair<String, LinkedList<Instr>>> env = cf.get_env();
        
        for(int i=0; i<n ; i++){
            env.pop();
        }
        
        cf.set_env(env);
        cf.get_code().pop();
    }
}