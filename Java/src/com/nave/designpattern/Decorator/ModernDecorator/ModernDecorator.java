package com.nave.designpattern.Decorator.ModernDecorator;

import java.util.Map;

import com.nave.designpattern.Decorator.Domain.Request;

public class ModernDecorator {
    public static void main(String[] args) {
        var processors = new RequestProcessors();

        RequestProcessor emptyFunction = (i) -> {
        };

        var processorPipeline = emptyFunction
                .andThen(processors::loggingProcessor)
                .andThen(processors::validationProcessor)
                .andThen(processors::baseProcessor);

        var headers = Map.of("Authorization", "Bearer token123");
        var validRequest = new Request("192.168.1.1", headers);
        var invalidRequest = new Request("192.168.1.1", null);

        try {
            processorPipeline.process(validRequest);
            processorPipeline.process(invalidRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

@FunctionalInterface
interface RequestProcessor {
    void process(Request request);

    default RequestProcessor andThen(RequestProcessor next) {
        return request -> {
            this.process(request);
            next.process(request);
        };
    }
}

class RequestProcessors {
    void loggingProcessor(Request request) {
        System.out.println("Logging request: " + request);
    }

    void validationProcessor(Request request) {
        if (isRequestInvalid(request)) {
            throw new IllegalArgumentException("Missing Authorization header");
        }
    }

    void baseProcessor(Request request) {
        System.out.println("Request processed successfully");
    }

    private boolean isRequestInvalid(Request request) {
        return request.headers() == null || !request.headers().containsKey("Authorization");
    }
}
