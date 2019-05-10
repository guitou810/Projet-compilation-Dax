/**
 *
 * @author Dax guillaume
 */
public class Snd extends Instr{
    
    @Override
    void exec_instr(Config cf){
        cf.set_value(((PairV)(cf.get_value())).get_snd());
        cf.get_code().pop();
    }
    
}