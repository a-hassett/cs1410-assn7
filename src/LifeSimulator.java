public class LifeSimulator{
    private boolean[][] grid;
    private int sizeX;
    private int sizeY;

    public LifeSimulator(int sizeX, int sizeY) {
        this.grid = new boolean[sizeX][sizeY];
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        //initialize the grid as entirely empty
        for(int x = 0; x < this.sizeX; x++){
            for(int y = 0; y < this.sizeY; y++){
                this.grid[x][y] = false;
            }
        }
    }

    public int getSizeX() { return this.sizeX; }

    public int getSizeY() { return this.sizeY; }

    public boolean getCell(int x, int y) { return this.grid[x][y]; }

    public void insertPattern(Pattern pattern, int startX, int startY) {
        //iterate for every row and column in the pattern's size
        //add pattern to previously empty grid
        for(int x = 0; x < pattern.getSizeX(); x++){
            for(int y = 0; y < pattern.getSizeY(); y++){
                try {
                    this.grid[startX + x][startY + y] = pattern.getCell(x, y);
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }
        }
    }

    public void update() {
        boolean[][] updatedGrid = new boolean[this.sizeX][this.sizeY];

        for(int x = 0; x < this.sizeX; x++){
            for(int y = 0; y < this.sizeY; y++){
                int neighbors = 0;
                try {
                    if(this.grid[x - 1][y - 1]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x][y - 1]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x + 1][y - 1]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x - 1][y]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x + 1][y]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x - 1][y + 1]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x][y + 1]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}
                try {
                    if(this.grid[x + 1][y + 1]) {
                        neighbors += 1;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {}

                //checking rules
                if(this.grid[x][y] && (neighbors == 2 || neighbors == 3)){
                    updatedGrid[x][y] = true;
                } else if(!this.grid[x][y] && neighbors == 3){
                    updatedGrid[x][y] = true;
                } else{
                    updatedGrid[x][y] = false;
                }
            }
        }

        //updating grid
        for(int x = 0; x < this.sizeX; x++){
            for(int y = 0; y < this.sizeY; y++){
                this.grid[x][y] = updatedGrid[x][y];
            }
        }

    }
}