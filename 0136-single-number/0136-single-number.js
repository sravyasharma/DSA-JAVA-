/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let xor=0;
    for(let n of nums){
        xor^=n;
    }
    return xor;
};