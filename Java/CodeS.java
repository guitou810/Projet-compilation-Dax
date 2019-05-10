import java.util.LinkedList;

public class CodeSE extends StackElem{
    private final LinkedList<Instr> code;
    
    public CodeSE(LinkedList<Instr> code){
        this.code = code;
    }

    public LinkedList<Instr> get_code() {
        return code;
    }    
    
    
}