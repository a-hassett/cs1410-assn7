public class PatternBlinker extends Pattern {
    /*
    XXX
    */

    @Override
    public int getSizeX(){ return 3; }

    @Override
    public int getSizeY(){ return 1; }

    @Override
    public boolean getCell(int x, int y){ return true; }
    //use pattern above and return true wherever there is an X
}
