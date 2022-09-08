//        nums=res(nums);
//         int len = nums.length;
//         int p=0;
//         for(int i=len-2;i>0;i--){
//             if(nums[i]<nums[i+1]){
//                 p=i;
//                 break;
//             }
//         }
//         int q=0;
//         for(int i=len-1;i>=p;i--){
//             if(nums[p]<nums[i]){
//                 q=i;
//                 break;
//             }
//         }
//         int temp = nums[p];
//         nums[p]=nums[q];
//         nums[q]=temp;
//         int s=p+1,e=len-1;
//         if(p==0 && q==0)
//             s=0;
//         while(s<e){