public class PatternAcorn extends Pattern {
    /*
    _X_____
    ___X___
    XX__XXX
    */

    @Override
    public int getSizeX(){ return 7; }

    @Override
    public int getSizeY(){ return 3; }

    @Override
    public boolean getCell(int x, int y){
        //use pattern above and return true wherever there is an X
        if(x == 1 && y == 0){
            return true;
        } else if(x == 3 && y == 1){
            return true;
        } else if(y == 2){
            if(x == 2 || x == 3){
                return false;
            } else{
                return true;
            }
        } else{
            return false;
        }
    }
}
