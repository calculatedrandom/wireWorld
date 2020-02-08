package WireWorld;

public class World {
    int width, height;
    Cell[][] grid;

    public void setGrid(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new Cell[width][height];
    }

    public void setConductorAtCell(int posX, int posY) {
        Cell cell = new Cell();
        cell.state = State.CONDUCTOR;
        grid[posX][posY] = cell;
    }
}
