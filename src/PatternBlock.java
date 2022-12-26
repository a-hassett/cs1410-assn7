public class PatternBlock extends Pattern {
    /*
    XX
    XX
    */

    @Override
    public int getSizeX(){ return 2; }

    @Override
    public int getSizeY(){ return 2; }

    @Override
    public boolean getCell(int x, int y){ return true; }
    //use pattern above and return true wherever there is an X
}
