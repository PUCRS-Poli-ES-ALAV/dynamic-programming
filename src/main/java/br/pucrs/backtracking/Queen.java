package br.pucrs.backtracking;

public class Queen {
    private int row;
    private int column;

    public Queen(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    @Override
    public String toString() {
        return "Queen [row=" + row + ", column=" + column + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Queen other = (Queen) obj;
        return row == other.row && column == other.column;
    }
    @Override
    public int hashCode() {
        return 31 * row + column;
    }
}
