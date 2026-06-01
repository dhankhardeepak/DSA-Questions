/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a,b) => a - b)
    let result = [];

    for(let i = 0; i < nums.length - 2; i++){
        if(i > 0 && nums[i] == nums[i-1]){ continue ;}
        let n1 = nums[i];
        let target = n1 == 0 ? 0 : -1 * n1;
        twoSum(nums, target, i+1, nums.length - 1, result)
    }

    return result;
};

var twoSum = function(nums, target, i, j, result){
    while(i < j){
        if(nums[i] + nums[j] > target){
            j--;
        }
        else if(nums[i] + nums[j] < target){
            i++;
        }
        else{
            while(nums[i] == nums[i+1]) i++;
            while(nums[j] == nums[j-1]) j--;
            const n1 = target == 0 ? 0 : -1 * target;
            result.push([n1, nums[i], nums[j]])
            i++;
            j--;
        }
    }
}