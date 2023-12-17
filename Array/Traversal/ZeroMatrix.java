import java.util.*;

public class ZeroMatrix {

  public static ArrayList<ArrayList<Integer>> zeroMatrix(
    ArrayList<ArrayList<Integer>> matrix,
    Integer n,
    Integer m
  ) {
    ArrayList<Integer> row = new ArrayList<>();
    ArrayList<Integer> column = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == 0) {
          row.add(i);
          column.add(j);
        }
      }
    }

    for (int i = 0; i < row.size(); i++) {
      int index = row.get(i);
      for (int j = 0; j < m; j++) {
        matrix.get(index).set(j, 0);
      }
    }
    for (int i = 0; i < column.size(); i++) {
      int index = column.get(i);
      for (int j = 0; j < n; j++) {
        matrix.get(j).set(index, 0);
      }
    }
    return matrix;
  }

  public static ArrayList<ArrayList<Integer>> zeroMatrix2(
    ArrayList<ArrayList<Integer>> matrix,
    Integer n,
    Integer m
  ) {
    boolean rowHasZero = false;
    boolean columnHasZero = false;

    for (int i = 0; i < m; i++) {
      if (matrix.get(0).get(i) == 0) {
        rowHasZero = true;
        break;
      }
    }

    for (int i = 0; i < n; i++) {
      if (matrix.get(i).get(0) == 0) {
        columnHasZero = true;
        break;
      }
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (matrix.get(i).get(j) == 0) {
          matrix.get(0).set(j, 0);
          matrix.get(i).set(0, 0);
        }
      }
    }

    for (int i = 1; i < n; i++) {
        for(int j = 1; j < m; j++) {
            if(matrix.get(0).get(j) == 0 || matrix.get(i).get(0) == 0) {
                matrix.get(i).set(j, 0);
            }
        }
    }


    if (rowHasZero) {
      for (int i = 0; i < m; i++) {
        matrix.get(0).set(i, 0);
      }
    }

    if (columnHasZero) {
      for (int i = 0; i < n; i++) {
        matrix.get(i).set(0, 0);
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    ArrayList<Integer> row1 = new ArrayList<>();
    row1.add(1);
    row1.add(0);
    row1.add(1);
    ArrayList<Integer> row2 = new ArrayList<>();
    row2.add(1);
    row2.add(1);
    row2.add(1);
    ArrayList<Integer> row3 = new ArrayList<>();
    row3.add(1);
    row3.add(1);
    row3.add(1);
    matrix.add(row1);
    matrix.add(row2);
    matrix.add(row3);
    zeroMatrix(matrix, 3, 3);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matrix.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}
