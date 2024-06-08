package com.testing;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.TestFactory;

class DynamicTestsDemo {

    // This will result in a JUnitException!
    @TestFactory
   Stream dynamicTestsWithInvalidReturnType() {
        return Arrays.asList("Hello").stream();
    }

    
   
    
}
