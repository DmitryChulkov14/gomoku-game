package net.jurinson.Impl;


public class ComputerCantMakeTurnException extends IllegalStateException{
    public ComputerCantMakeTurnException(String message) {
        super(message);
    }
}
