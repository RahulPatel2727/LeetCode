/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
class Counter {
  constructor(init) {
    this.init = init;
    this.currentCount = init;
  }

  increment() {
    this.currentCount += 1;
    return this.currentCount;
  }

  decrement() {
    this.currentCount -= 1;
    return this.currentCount;
  }

  reset() {
    this.currentCount = this.init;
    return this.currentCount;
  }
}


var createCounter = function(init) {
  return new Counter(init);
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */