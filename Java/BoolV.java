
public class BoolV extends Value{
    private final boolean b;
    
    public BoolV(boolean b){
        this.b = b;
    }
    
    boolean get_bool(){return b;}
    
    @Override
    void print_value(){
        System.out.print(b);
    }
    
    
}