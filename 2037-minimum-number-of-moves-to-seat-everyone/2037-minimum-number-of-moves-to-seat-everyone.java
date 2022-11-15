class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int c=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        
        for(int i = 0; i<seats.length;i++){
            int count = Math.abs(seats[i]-students[i]);
            c+=count;
        }
        return c;
    }
}