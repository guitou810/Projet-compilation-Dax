
public class Cons extends Instr{

    @Override
    void exec_instr(Config cf) {
        ValueSE y = (ValueS)cf.get_stack().pop();




        cf.set_value(new Pairv(y.get_valeur(), cf.get_value()));
        cf.get_code().pop();
    }
    
    
    
}