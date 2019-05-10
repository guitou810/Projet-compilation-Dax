import java.util.LinkedList;


public class App extends Instr{

    @Override
    void exec_instr(Config cf) {
        cf.get_code().pop();
        Pairv pair = (Pairv)cf.get_value();
		// Closure pas fait 
        ClosureV closure = (ClosureV) pair.get_first();
        cf.set_value(new Pairv(closure.get_valeur(), pair.get_snd()));
        cf.get_stack().addFirst(new CodeS(cf.get_code()));
        

        cf.set_code(new LinkedList<>(closure.get_code()));
    }
    
}