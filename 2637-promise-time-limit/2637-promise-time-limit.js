/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
	return async function(...args) {
        return new Promise(async(res, rej)=>{
            const timeOut = setTimeout(()=>{
                rej("Time Limit Exceeded")
            }, t)
            try{
                const ans = await fn(...args)
                res(ans);
            }catch(err){
                rej(err);
            }
            clearTimeout(timeOut);
        })
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */