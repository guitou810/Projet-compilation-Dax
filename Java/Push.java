
public class Push extends Instr{

    @Override
    void exec_instr(Config cf) {
        cf.get_stack().addFirst(new ValueSE(cf.get_value()));
        cf.get_code().pop();
    }
    
    
    
}