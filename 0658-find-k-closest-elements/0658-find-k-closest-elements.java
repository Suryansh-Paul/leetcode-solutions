class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]<x){
                left = mid+1;
            }
            else{
                right=mid-1;
            }
        }

        int l=left-1;
       int  r=left;

        List<Integer> ans = new ArrayList<>();
        
        while(ans.size()<k){
            if(l<0){
                ans.add(arr[r]);
                r++;
            }
            else if(r>arr.length-1){
                ans.add(arr[l]);
                l--;
            }
            else if(x-arr[l]<=arr[r]-x){
                ans.add(arr[l]);
                l--;
            }
            else{
                ans.add(arr[r]);
                r++;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}