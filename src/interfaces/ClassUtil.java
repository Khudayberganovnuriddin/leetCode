package interfaces;

public class ClassUtil<T> {
    private T val;

    ClassUtil(T v) {
        val = v;
    }

    ClassUtil() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
