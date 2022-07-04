class Solution {
    public int candy(int[] ratings) {
            
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        
        for(int i =0; i<ratings.length - 1; i++){
            if(ratings[i+1] > ratings[i]) candies[i+1] = candies[i] + 1;
        }
        for(int i = ratings.length -2; i>=0; i--){
            if(ratings[i] > ratings[i+1] && candies[i] <=candies[i+1]) candies[i] = candies[i+1] +  1;
         }
        
        int sum = 0;
        for(int s : candies){
            sum+=s;
        }
        return sum;
//         int n = ratings.length;
//         int[] candies = new int[n];
        
//         Arrays.fill(candies, 1);
        
//         boolean changed = true;
        
//         while(changed){
//             changed = false;
//             for(int i =0; i<n; i++){
//                 if(i!=n-1 &&  ratings[i+1] < ratings[i] && candies[i+1] >= candies[i]){
//                     changed = true;
//                     candies[i] = candies[i+1] +1;
//                 }
//                 if(i>0&& ratings[i-1] < ratings[i] && candies[i-1] >= candies[i]){
//                     changed = true;
//                     candies[i] = candies[i-1] + 1;
//                 }
                
//             }
//         }
        
//         int sum = 0;
//         for(int s : candies){
//             sum+=s;
//         }
//         return sum;
        
    }
}

// public class Solution {
//     public int candy(int[] ratings) {
//         int[] candies = new int[ratings.length];
//         Arrays.fill(candies, 1);
//         boolean hasChanged = true;
//         while (hasChanged) {
//             hasChanged = false;
//             for (int i = 0; i < ratings.length; i++) {
//                 if (i != ratings.length - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
//                     candies[i] = candies[i + 1] + 1;
//                     hasChanged = true;
//                 }
//                 if (i > 0 && ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
//                     candies[i] = candies[i - 1] + 1;
//                     hasChanged = true;
//                 }
//             }
//         }
//         int sum = 0;
//         for (int candy : candies) {
//             sum += candy;
//         }
//         return sum;
//     }
// }