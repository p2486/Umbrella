package at.ac.fhstp.gof.prototype;

public interface PrototypeCapable extends Cloneable {
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
