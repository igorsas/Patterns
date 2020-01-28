package com.igor.structural.flyweight.factory;

import com.igor.structural.flyweight.model.Transformer;
import com.igor.structural.flyweight.model.TransformerType;

import java.util.*;

public class TransformerFactory {
    private static Map<String, Transformer> transformers = new HashMap<>();

    public static Transformer getTransformer(String name, TransformerType transformerType){
        Transformer transformer = transformers.get(name);
        if(Objects.isNull(transformer)){
            transformer = new Transformer(name, transformerType);
            transformers.put(name, transformer);
        }
        return transformer;
    }
}
