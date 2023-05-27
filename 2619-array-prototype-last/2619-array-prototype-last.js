if (!Array.prototype.findLast) {
    Array.prototype.findLast = function(predicate) {
        for (let i = this.length - 1; i >= 0; i--) {
            if (predicate(this[i], i, this)) {
                return this[i];
            }
        }
        return undefined;
    };
}

Array.prototype.last = function() {
  return this.findLast(() => true) ?? -1;
}
/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */