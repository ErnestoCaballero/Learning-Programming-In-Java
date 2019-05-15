public class TestMaze {
    private char[][] solution;

    public TestMaze() {
        solution = new char[20][20];
        fillSolution();
    }


    public void printMap() {
        printMap(solution);
    }

    private void printMap(char[][] map) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (map[i][j] == Character.MIN_VALUE) {
                    System.out.print(". ");
                } else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void fillSolution() {
        for (int i = 0; i < 6; i++) {
            solution[0][i] = '-';
        }
        for (int i = 0; i < 5; i++) {
            solution[1][i] = '*';
        }
        for (int i = 2; i < 20; i++) {
            solution[i][4] = '*';
        }
        solution[19][4] = '-';
        solution[1][5] = '|';
        solution[2][5] = '|';
        for (int i = 0; i < 14; i++) {
            solution[2][i] = '-';
        }
        solution[2][4] = '*';
        for (int i = 3; i < 20; i++) {
            solution[i][3] = '|';
        }
        for (int i = 4; i < 15; i++) {
            solution[3][i] = '*';
        }
        solution[2][14] = '|';
        solution[1][14] = '|';
        solution[0][14] = '-';
        solution[0][15] = '-';
        solution[0][16] = '-';
        for (int i = 1; i < 7; i++) {
            solution[i][16] = '|';
        }
        solution[7][14] = '-';
        solution[7][15] = '-';
        solution[7][16] = '-';
        for (int i = 5; i < 15; i++) {
            solution[4][i] = '-';
        }
        solution[5][14] = '|';
        solution[6][14] = '|';
        for (int i = 1; i < 7; i++) {
            solution[i][15] = '*';
        }
        for (int i = 5; i < 20; i++) {
            solution[i][5] = '|';
        }
        for (int i = 5; i < 17; i++) {
            solution[12][i] = '-';
            solution[13][i] = '*';
            solution[14][i] = '-';
        }
        solution[11][16] = '|';
        solution[10][16] = '|';
        solution[14][18] = '|';
        solution[13][18] = '|';
        solution[12][18] = '|';
        solution[11][18] = '-';
        solution[11][19] = '-';
        solution[9][16] = '-';
        solution[9][17] = '-';
        solution[9][18] = '-';
        solution[9][19] = '-';
        solution[14][17] = '-';
        for (int i = 10; i < 14; i++) {
            solution[i][17] = '*';
        }
        solution[10][18] = '*';
        solution[10][19] = '*';
        for(int i = 5; i < 13; i++) {
            solution[8][i] = '-';
            solution[10][i] = '-';
            solution[9][i] = '*';
        }
        for (int i = 8; i < 11; i++) {
            solution[i][13] = '|';
        }
        for(int i = 5; i < 19; i++) {
            solution[17][i] = '-';
            solution[19][i] = '-';
            solution[18][i] = '*';
        }
        for (int i = 17; i < 20; i++) {
            solution[i][19] = '|';
        }
        for(int i = 3; i >= 0; i--) {
            solution[14][i] = '-';
            solution[16][i] = '-';
            solution[15][i] = '*';
        }
        for (int i = 14; i < 17; i++) {
            solution[i][0] = '|';
        }
        addPits();
    }

    private void addPits(){
        solution[1][2] = '0';
        solution[3][7] = '0';
        solution[3][12] = '0';
        solution[6][4] = '0';
        solution[15][4] = '0';
        solution[9][10] = '0';
        //solution[13][17] = '0';
        solution[13][15] = '0';
        solution[18][10] = '0';
    }
}
