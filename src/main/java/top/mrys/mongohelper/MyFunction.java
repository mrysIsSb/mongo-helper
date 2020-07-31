package top.mrys.mongohelper;

/**
 * @author mrys
 * @date 2020/7/31
 */
@FunctionalInterface
public interface MyFunction<R,T> {
    R apply(T t);
}
