package main.java.operations;

public interface Visitable {
    public boolean accept(Visitor visitor);
}