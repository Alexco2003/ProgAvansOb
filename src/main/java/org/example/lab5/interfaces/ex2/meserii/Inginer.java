package org.example.lab5.interfaces.ex2.meserii;

public interface Inginer extends Worker{
    default boolean knowsBuildingPCs() {
        return true;
    }
}
