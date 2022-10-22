class Solution {
    public String minWindow(String s, String t) {
        int[] arr = new int[52];      // creating 52 size array because of upper and lowercase character
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            int idx = -1;
            if(ch >= 'A' && ch <= 'Z'){
                idx = t.charAt(i) - 'A' + 26;
            }else{
                idx = t.charAt(i) - 'a';
            }
            arr[idx]++;   // counting frequency of character of string t
        }
        int[] narr = new int[52];    // array for storing frequency of character for string s from index j to i
        int si = -1;      // starting index of smallest which contains t
        int ei = -1;     // ending index of smallest which contains t
        int ans = Integer.MAX_VALUE;   // length of smallest string which contains t
        
        int i = 0;   // representing string ending at ith index
        int j = 0;   // representing string starting at jth index
        while(i < s.length()){
            char ch = s.charAt(i);
            int idx = -1;
            if(ch >= 'A' && ch <= 'Z'){
                idx = ch - 'A' + 26;
            }else{
                idx = ch - 'a';
            }
            narr[idx]++;      //    counting frequence of character of string s from index j to i
            boolean flag = check(arr, narr);    // checking between index j to i all character of t is present in s or not
        
            if(flag == true){         
					if(i - j + 1 < ans){                   // if present then check its length is less than the previous valid length or not
                    ans = i - j + 1;  // update length of smallest valid string
                    si = j;     // update starting index of smallest valid string
                    ei = i;    // update ending index of smallest valid string
                }
                while(j <= i && j < s.length() && flag == true){    // if flag is true then decrease frequency of jth character and move j to next position 
                    char c = s.charAt(j);
                    int id = -1;
                    if(c >= 'A' && c <= 'Z'){
                        id = c - 'A' + 26;
                    }else{
                        id = c - 'a';
                    }
                    narr[id]--;      
                    flag = check(arr, narr); // until the flag is true move j to next position
                    j++;
                    if(flag == true){
                        if(i - j + 1 < ans){     // update starting, ending and ans of valid string
                            ans = i - j + 1;
                            si = j;
                            ei = i;
                        }
                    }
                    
                }
                
            }
            i++;
        }
        
        if(si == -1 || ei == -1){    // if starting or ending index == -1 then no valid string exist so return empty string
            return "";
        }
        String fans = s.substring(si, ei + 1);  // if exist 
        return fans;
    }
    
    public boolean check(int[] arr, int[] narr){    // checking all characters of t is present in s from index j to i
        
        for(int k = 0; k < 52; k++){
            if(arr[k] > narr[k]){
                return false;
            }
        }
        return true;
    }
}