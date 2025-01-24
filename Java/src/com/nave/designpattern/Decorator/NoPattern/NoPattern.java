package com.nave.designpattern.Decorator.NoPattern;

import java.util.Map;

import com.nave.designpattern.Decorator.Domain.Request;

public class NoPattern {
    public static void main(String[] args) {
        var processor = new RequestProcessor();

        var headers = Map.of("Authorization", "Bearer token123");
        var validRequest = new Request("192.168.1.1", headers);
        var invalidRequest = new Request("192.168.1.1", null);

        try {
            processor.process(validRequest);
            processor.process(invalidRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class RequestProcessor {
    public void process(Request request) throws Exception {
        // Logging
        System.out.println("Logging request: " + request);

        // Validation
        if (isRequestInvalid(request)) {
            throw new Exception("Missing Authorization header");
        }

        // Actual processing
        System.out.println("Request processed successfully");
    }

    private boolean isRequestInvalid(Request request) {
        return request.headers() == null || !request.headers().containsKey("Authorization");
    }
}