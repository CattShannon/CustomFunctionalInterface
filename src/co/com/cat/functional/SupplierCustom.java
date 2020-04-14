package co.com.cat.functional;

@FunctionalInterface
public interface SupplierCustom<T, V, R> {
    /**
     * This method returns an instance of an object
     * who recieve his propierties by params
     * @param t
     * @param v
     * @return
     */
    R get(T t, V v);
}
