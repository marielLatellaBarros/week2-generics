package be.pxl.generics.opgave2;

public class ChessPiece implements Moveable<ChessBoardLocation>{

    private ChessBoardLocation chessBoardLocation;

    @Override
    public void move(ChessBoardLocation cbl) {
        this.chessBoardLocation = cbl;

    }

    @Override
    public ChessBoardLocation getCurrentLocation() {
        return this.chessBoardLocation;
    }
}
