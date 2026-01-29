class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int currprofit;
        int max=0;//max ko zero se initilaise krna prega vrna value neg //bhi ho skti h
        for(int i=0; i<n; i++){
            //first we have to buy before sell
            if(min>prices[i]){
               min=prices[i];
            }
            //ab step 2:ki agar aj run krun toh kitna max profit hoga 
            int buy=min;
            int sell=prices[i];
            currprofit=sell-buy;
            if(currprofit>max){
               max=currprofit;
            }
           
            


        }
       
return max;

    }
}