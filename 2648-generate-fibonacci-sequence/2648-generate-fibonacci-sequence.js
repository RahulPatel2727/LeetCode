/**
 * @return {Generator<number>}
 */
var fibGenerator = function() {
    // Determine the number of Fibonacci numbers to generate
    const lengthOfSequence = 50;

    const fibonacciSequence = Array(lengthOfSequence).fill(0);

    fibonacciSequence[1] = 1;

    for (let i = 2; i < fibonacciSequence.length; i++) {
        fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
    }

    // Return an iterator for the array
    return fibonacciSequence[Symbol.iterator]();
};


/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */