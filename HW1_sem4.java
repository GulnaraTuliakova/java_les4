package HW;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class HW1_sem4 {

    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1));
        System.out.println(checkOn(deque));
    }
    public static boolean checkOn(Deque<Integer> deque) {
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast())
                break;
        }
        if (deque.size() > 1)
            return false;
        return true;
    }
}