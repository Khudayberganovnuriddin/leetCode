package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Learning {

  public static Future<String> calculateAsync() {
    CompletableFuture<String> completableFuture = new CompletableFuture<>();

    Executors.newCachedThreadPool().submit(() -> {
      Thread.sleep(5000);
      completableFuture.complete("Hello");
      return null;
    });
    return completableFuture;
  }

  public static void main(String[] args) {
//        Future<String> stringFuture = calculateAsync();
//        String result = stringFuture.get();
//        System.out.println(result);
//        assertEquals("hello", result);

    int[] nums = new int[]{2, 3, 1, 1, 4};
//        System.out.println(isDuplicate(nums));
    System.out.println(canJump(nums));
  }

  public static int isDuplicate(int[] numbers) {
    int tortoise = numbers[0];
    int hare = numbers[0];
    while (true) {
      tortoise = numbers[tortoise];
      hare = numbers[numbers[hare]];
        if (tortoise == hare) {
            break;
        }
    }
    int ptr1 = numbers[0];
    int ptr2 = tortoise;

    while (ptr1 != ptr2) {
      ptr1 = numbers[ptr1];
      ptr2 = numbers[ptr2];
    }
    return ptr1;
  }

  public static boolean canJump(int[] nums) {
    int farthest = 0;

    for (int i = 0; i < nums.length; i++) {
        if (i > farthest) {
            return false;
        }
      if (nums[i] + i > farthest) {
        farthest = nums[i] + i;
      }
        if (farthest >= nums.length - 1) {
            return false;
        }
    }
    return false;
  }
}
