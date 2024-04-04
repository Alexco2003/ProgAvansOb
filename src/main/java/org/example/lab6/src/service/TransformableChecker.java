package org.example.lab6.src.service;

import org.example.lab6.src.exceptions.NotTransformableException;
import org.example.lab6.src.marker.Transformable;

public class TransformableChecker {
    public void transform(Object obj) throws NotTransformableException {
        if (obj instanceof Transformable) {
            System.out.println("Object is transformable");

        } else {
            throw new NotTransformableException("Object is not transformable");

        }


    }
}
