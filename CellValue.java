package net.jurinson;

public enum CellValue {
    EMPTY(' '),
    HUMAN('X'),
    COMPUTER('O');

    private char value;

    CellValue(char value){
        this.value = value;
    }

    String getValue(){
        return String.valueOf(value);
    }
}
