/**
 * @param {any} obj
 * @param {any} classFunction
 * @return {boolean}
 */
function* prototypeGenerator(obj) {
  let currPrototype = Object.getPrototypeOf(obj);
  while (currPrototype !== null) {
    yield currPrototype;
    currPrototype = Object.getPrototypeOf(currPrototype);
  }
}

var checkIfInstanceOf = function (obj, classFunction) {
  if (obj === null || obj === undefined || typeof classFunction !== "function")
    return false;

  for (const prototype of prototypeGenerator(obj)) {
    if (prototype === classFunction.prototype) return true;
  }

  return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */