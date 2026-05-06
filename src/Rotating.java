import java.util.Arrays;
public class Rotating {
        public static void main(String[] args) {
            char[][] box = {{'#','.','*','.'},
                    {'#','.','.','*'},
                  };
            char[][] arr =  rotateBox(box);
            printArr(arr);
        }
    private static void printArr(char[][] arr) {
        int row  = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    private static char[][] rotateBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;
        char[][] newChar = new char[col][row];
        char[][] secChar = new char[row][col];
        for(int i=0;i<row;i++){
            for (int j = 0;j<col;j++){
                newChar[j][i] = box[i][j];
            }
        }
        int row2 = newChar.length;
        int col2 = newChar[0].length;
        for(int i=0;i<col2;i++){
            for(int j=0;j<row2;j++){
                secChar[col2-i-1][j] = newChar[j][i];
            }
        }

        for(int i=0;i<secChar.length;i++){
            int left = 0;
            int right = 1;
        while(right < secChar[0].length){
            if(secChar[i][left] == '.'){
                left++;
                right++;
            } else if (secChar[i][right] == '#') {
                right++;
            } else if (secChar[i][right] == '*') {
                left = right;
                right++;
            }else if(secChar[i][right] == '.' && secChar[i][left] != '#'){
                right++;
                left++;
            } else if (secChar[i][right] == '.' && secChar[i][left] == '#') {
                char temp = secChar[i][left];
                secChar[i][left] = secChar[i][right];
                secChar[i][right] = temp;
            }
        }
        }
        for(int i=0;i<secChar.length;i++){
            for (int j = 0;j<secChar[0].length;j++){
                newChar[j][i] = secChar[i][j];
            }
        }
        return newChar;
    }

}

class mats {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        // 1. Apply Gravity horizontally (moving stones to the right)
        for (int i = 0; i < m; i++) {
            int empty = n - 1; // The rightmost potential position for a stone
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1; // Obstacle! Next stone must stop before this
                } else if (box[i][j] == '#') {
                    // Move stone to the 'empty' position and update 'empty'
                    box[i][j] = '.';
                    box[i][empty] = '#';
                    empty--;
                }
            }
        }

        // 2. Rotate the box 90 degrees clockwise
        char[][] result = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Formula for 90-degree clockwise rotation:
                // (row, col) becomes (col, totalRows - 1 - row)
                result[j][m - 1 - i] = box[i][j];
            }
        }

        return result;
    }
}