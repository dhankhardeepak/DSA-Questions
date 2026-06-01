/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let low = 0;
    let high = numbers.length - 1;

    while(low < high){
        const currentSum = numbers[low] + numbers[high];
        if(currentSum == target){
            return [low+1, high+1];
        }
        else if(currentSum > target){
            high--;
        }
        else{
            low++;
        }
    }

    return [1,2]
};