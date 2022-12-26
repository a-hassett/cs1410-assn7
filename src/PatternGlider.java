public class PatternGlider extends Pattern {
    /*
    _X_
    __X
    XXX
    */

    @Override
    public int getSizeX(){ return 3; }

    @Override
    public int getSizeY(){ return 3; }

    @Override
    public boolean getCell(int x, int y){
        //use pattern above and return true wherever there is an X
        if(x == 1 && y == 0){
            return true;
        } else if(x == 2 && y == 1){
            return true;
        } else if(y == 2){
            return true;
        } else{
            return false;
        }
    }
}
