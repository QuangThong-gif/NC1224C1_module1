package ss9_arraylist;
import java.util.*;

public class Exercise1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int elementCount;
        do {
            System.out.print("Nhập số phần tử: ");
            elementCount = input.nextInt();
            if (elementCount <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương (n > 0).");
            }
        } while (elementCount <= 0);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < elementCount; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            list.add(input.nextInt());
        }

        System.out.println("Danh sách các phần tử: " + list);

        System.out.println("Số lượng phần tử lẻ: " + countOddNumbers(list));

        System.out.println("Tổng các số lẻ dương: " + sumOddNumbers(list));

        System.out.print("Nhập giá trị của k: ");
        int k = input.nextInt();

        ArrayList<Integer> positions = findPositions(list, k);

        if (positions.isEmpty()) {
            System.out.println("Không tìm thấy phần tử k.");
        } else {
            System.out.println("Vị trí của k: " + positions);
        }

        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + list);

        Collections.reverse(list);
        System.out.println("Danh sách sau khi đảo ngược: " + list);

        System.out.print("Nhập phần tử muốn xóa: ");
        int x = input.nextInt();
        list.removeAll(Arrays.asList(x));
        System.out.println("Danh sách sau khi xóa: " + list);

        System.out.print("Nhập giá trị bạn muốn chèn: ");
        int value = input.nextInt();
        System.out.print("Nhập vị trí bạn muốn chèn: ");
        int position = input.nextInt();
        if (position >= 0 && position <= list.size()) {
            list.add(position, value);
        }
        System.out.println("Danh sách sau khi chèn: " + list);

        System.out.println("Giá trị lớn nhất: " + Collections.max(list));

        System.out.println("Giá trị nhỏ nhất: " + Collections.min(list));

        list.removeAll(Arrays.asList(Collections.max(list)));
        System.out.println("Giá trị lớn thứ hai: " + list.get(0));
    }

    public static int countOddNumbers(ArrayList<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumOddNumbers(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number > 0 && number % 2 != 0) {
                total += number;
            }
        }
        return total;
    }

    public static ArrayList<Integer> findPositions(ArrayList<Integer> numbers, int target) {
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                positions.add(i);
            }
        }
        return positions;
    }
}
