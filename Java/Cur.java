import java.util.LinkedList;


public class Cur extends Instr{
    LinkedList<Instr> code;
    
    public Cur(LinkedList<Instr> code){
        this.code = code;
    }
// closureV pas réusi à le faire
    @Override
    void exec_instr(Config cf) {
        cf.set_value(new ClosureV(code, cf.get_value()));
        cf.get_code().pop();
    }
    
}