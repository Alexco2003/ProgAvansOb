package org.example.lab6.src.test.marker;

import org.example.lab6.src.exceptions.NotTransformableException;
import org.example.lab6.src.models.Bumblebee;
import org.example.lab6.src.service.TransformableChecker;

public class TestTransformable {

    public static void main(String[] args) throws NotTransformableException {

        TransformableChecker transformableChecker = new TransformableChecker();
        Bumblebee bumblebee = new Bumblebee("yellow", true);
        transformableChecker.transform(bumblebee);
    }

}
