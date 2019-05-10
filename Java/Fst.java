/**
 *
 * @author Dax guillaume
 */
public class Fst extends Instr{
    
    @Override
    void exec_instr(Config cf){
        //Récupération du 1er élément du couple
        cf.set_value(((PairV)(cf.get_value())).get_first());
        cf.get_code().pop();
    }
    
}