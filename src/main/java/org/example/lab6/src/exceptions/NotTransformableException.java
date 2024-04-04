package org.example.lab6.src.exceptions;

import java.io.NotSerializableException;
import java.io.ObjectStreamException;

public class NotTransformableException extends ObjectStreamException {


    public NotTransformableException() {super(); }

    public NotTransformableException (String classname) { super(classname);}





}
