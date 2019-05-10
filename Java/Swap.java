/**
 *
 * @author Dax guillaume
 */
public class Swap extends Instr{

    @Override
    void exec_instr(Config cf) {
        Value x = cf.get_value();
        Value y = ((ValueS)cf.get_stack().pop()).get_valeur();
        

        cf.set_value(y);
        cf.get_stack().addFirst(new ValueS(x));
        
        cf.get_code().pop();
    }
    
    
    
}