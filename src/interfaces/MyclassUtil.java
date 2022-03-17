package interfaces;

public class MyclassUtil<T> {
    private T val;

    MyclassUtil(T v) {
        val = v;
    }

    MyclassUtil() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
