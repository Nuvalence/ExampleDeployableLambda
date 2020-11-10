package io.nuvalence.examples;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ExampleLambdaHandler implements RequestHandler<Void, Void> {


    @Override
    public Void handleRequest(Void input, Context context) {
        System.out.println("Hello World!");
        System.out.println("Im Tristan!");
        return null;
    }
}
