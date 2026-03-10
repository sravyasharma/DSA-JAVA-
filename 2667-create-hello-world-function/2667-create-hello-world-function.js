/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        let c="Hello World";
        return c;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */