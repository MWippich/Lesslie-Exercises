import java.util.concurrent.Callable;

public class Memoize<T> {

    private Callable<T> callable;
    private T result;

    private boolean calculated;

    public Memoize(Callable<T> callable){
        this.callable = callable;
        calculated = false;
    }

    public T get() throws Exception{
        if (calculated){
            //If .call() was already performed, return result.
            return result;
        } else {
            // .call() has not been performed, call .call(), store its result,
            // indicate that it was called and return the result.
            result = callable.call();
            calculated = true;

            return result;
        }
    }

}
