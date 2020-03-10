package SandBox.CrossToe;

//public class MatrixA {
//
//    static int[][] matrixA = {
//            {21, 22, 23},
//            {24, 25, 26},
//            {27, 28, 29}
//    };
//
//    public static void playerMoveX() throws IOException {
//        System.out.println("Ходит Х");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String numberDay = reader.readLine();
//        int getNum = Integer.parseInt(numberDay);
//
//        if (getNum == 1 || getNum == 0) {
//            //System.out.println("Клетка занята");
//            //playerMoveX();
//        } else if (getNum == 21) {
//            matrixA[0][0] = 1;
//        } else if (getNum == 22) {
//            matrixA[0][1] = 1;
//        } else if (getNum == 23) {
//            matrixA[0][2] = 1;
//        } else if (getNum == 24) {
//            matrixA[1][0] = 1;
//        } else if (getNum == 25) {
//            matrixA[1][1] = 1;
//        } else if (getNum == 26) {
//            matrixA[1][2] = 1;
//        } else if (getNum == 27) {
//            matrixA[2][0] = 1;
//        } else if (getNum == 28) {
//            matrixA[2][1] = 1;
//        } else if (getNum == 29) {
//            matrixA[2][2] = 1;
//
//        }
//    }
//
//    public static boolean chekWinX() {
//        if (matrixA[0][0] == 1 && matrixA[0][1] == 1 && matrixA[0][2] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//        } else if (matrixA[1][0] == 1 && matrixA[1][1] == 1 && matrixA[1][2] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//        } else if (matrixA[2][0] == 1 && matrixA[2][1] == 1 && matrixA[2][2] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//
//        } else if (matrixA[0][0] == 1 && matrixA[1][0] == 1 && matrixA[2][0] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//        } else if (matrixA[0][1] == 1 && matrixA[1][1] == 1 && matrixA[2][1] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//        } else if (matrixA[0][2] == 1 && matrixA[1][2] == 1 && matrixA[2][2] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//
//        } else if (matrixA[0][0] == 1 && matrixA[1][1] == 1 && matrixA[2][2] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//        } else if (matrixA[2][0] == 1 && matrixA[1][1] == 1 && matrixA[0][2] == 1) {
//            System.out.println("Побелили X !");
//            return true;
//        }
//        return false;
//    }
//
//    public static void playerMoveO() throws IOException {
//        System.out.println("Ходит О");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String numberDay = reader.readLine();
//        int getNum = Integer.parseInt(numberDay);
//
//
//        if (getNum == 1 || getNum == 0) {
//        } else if (getNum == 21) {
//            matrixA[0][0] = 0;
//        } else if (getNum == 22) {
//            matrixA[0][1] = 0;
//        } else if (getNum == 23) {
//            matrixA[0][2] = 0;
//        } else if (getNum == 24) {
//            matrixA[1][0] = 0;
//        } else if (getNum == 25) {
//            matrixA[1][1] = 0;
//        } else if (getNum == 26) {
//            matrixA[1][2] = 0;
//        } else if (getNum == 27) {
//            matrixA[2][0] = 0;
//        } else if (getNum == 28) {
//            matrixA[2][1] = 0;
//        } else if (getNum == 29) {
//            matrixA[2][2] = 0;
//        }
//    }
//
//    public static boolean chekWinO() {
//        if (matrixA[0][0] == 0 && matrixA[0][1] == 0 && matrixA[0][2] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//        } else if (matrixA[1][0] == 0 && matrixA[1][1] == 0 && matrixA[1][2] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//        } else if (matrixA[2][0] == 0 && matrixA[2][1] == 0 && matrixA[2][2] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//
//        } else if (matrixA[0][0] == 0 && matrixA[1][0] == 0 && matrixA[2][0] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//        } else if (matrixA[0][1] == 0 && matrixA[1][1] == 0 && matrixA[2][1] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//        } else if (matrixA[0][2] == 0 && matrixA[1][2] == 0 && matrixA[2][2] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//
//        } else if (matrixA[0][0] == 0 && matrixA[1][1] == 0 && matrixA[2][2] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//        } else if (matrixA[2][0] == 0 && matrixA[1][1] == 0 && matrixA[0][2] == 0) {
//            System.out.println("Побелили O !");
//            return true;
//        }
//        return false;
//    }
//
//    public static void getMatrix() {
//        //вывод матрицы на экран
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrixA[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//    }
//}
