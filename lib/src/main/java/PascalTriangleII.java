import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        int[] result =  new int[rowIndex + 1];
        result[0] = 1;
        for(int i = 1; i < rowIndex + 1; i++)
            for(int j = i; j >= 1; j--)
                result[j] += result[j - 1];
            System.out.println(result);
        return new ArrayList<>();
    }


    private List<Integer> generate(List<Integer> row) {
        List<Integer> result = new ArrayList<>(row.size() + 1);
        for (int i = 0; i < row.size() + 1; i++) {
            result.add(i == 0 || i == row.size() ? 1 : row.get(i) + row.get(i - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangleII pascalTriangle = new PascalTriangleII();
        System.out.println(pascalTriangle.getRow(4));
    }
}
