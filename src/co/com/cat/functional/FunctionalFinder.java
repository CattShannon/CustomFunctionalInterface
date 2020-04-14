package co.com.cat.functional;

@FunctionalInterface
/**
 * T type of the first param
 * V type of the second param
 * U type of the third param
 * R type of the result
 */

public interface FunctionalFinder<T, V, U, R> {

    /**
     * This method find an specific object from a list
     * @param t
     * @param v
     * @param u
     * @return R
     */
    R find(T t, V v, U u);

}
