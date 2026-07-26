class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] boxSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            boxSet[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char value = board[row][col];

                if (value == '.') {
                    continue;
                }

                int boxIndex = (row / 3) * 3 + (col / 3);

                if (rowSet[row].contains(value)
                        || colSet[col].contains(value)
                        || boxSet[boxIndex].contains(value)) {
                    return false;
                }

                rowSet[row].add(value);
                colSet[col].add(value);
                boxSet[boxIndex].add(value);
            }
        }

        return true;
    }
}