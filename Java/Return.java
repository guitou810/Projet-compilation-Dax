
public class Return extends Instr{

    @Override
    void exec_instr(Config cf) {
        cf.set_code(((CodeS)cf.get_stack().pop()).get_code());
    }
    
    
}