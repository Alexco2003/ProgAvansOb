package org.example.lab5.interfaces.ex2.meserii;

public interface Programator extends Worker{
    default boolean knowsCoding() {
        return true;
    }

}
