import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
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

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Future<String> stringFuture = calculateAsync();
//        String result = stringFuture.get();
//        System.out.println(result);
//        assertEquals("hello", result);

        int[] nums = new int[]{2,3,4,5,3};
        System.out.println(isDuplicate(nums));

    }

    public static int isDuplicate(int[] numbers){
        int tortoise = numbers[0];
        int hare = numbers[0];
        while(true){
            tortoise = numbers[tortoise];
            hare = numbers[numbers[hare]];
            if(tortoise == hare)
                break;
        }
        int ptr1 = numbers[0];
        int ptr2 = tortoise;

        while(ptr1 != ptr2){
            ptr1 = numbers[ptr1];
            ptr2 = numbers[ptr2];
        }
        return ptr1;
    }
}
