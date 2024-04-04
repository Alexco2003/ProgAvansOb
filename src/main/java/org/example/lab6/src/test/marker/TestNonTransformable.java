package org.example.lab6.src.test.marker;

import org.example.lab6.src.exceptions.NotTransformableException;
import org.example.lab6.src.models.Bumblebee;
import org.example.lab6.src.models.Sofa;
import org.example.lab6.src.service.TransformableChecker;

public class TestNonTransformable {

    public static void main(String[] args) throws NotTransformableException {

        try {
            TransformableChecker transformableChecker = new TransformableChecker();
            Sofa sofa = new Sofa("yellow", 12);
            transformableChecker.transform(sofa);
        } catch (NotTransformableException e) {
            System.out.println(e.getMessage());
        }

    }
}
