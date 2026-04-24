public class FurthestPoint {
    public static void main(String[] args) {
        String moves = "RL_";
        System.out.println(furthestDistanceFromOrigin(moves));
    }

    private static int furthestDistanceFromOrigin(String moves) {
        int dist = 0;
        int left = 0;
        int right = 0;
        int space = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                left++;
            } else if (moves.charAt(i) == 'R') {
                right++;
            }else{
                space++;
            }
        }
//        int originalLeft = left;
//        left = (left+space) - right;
//        right = (right+space) - originalLeft;
//        dist= Math.max(left,right);
        dist = Math.abs(left-right)+space;
        return dist;
    }
}
