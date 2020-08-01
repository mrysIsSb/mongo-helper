package top.mrys.mongohelper;

import java.util.function.Predicate;

/**
 * @author mrys
 * @date 2020/8/1
 */
public interface Find {

    Find and();
    Find and(Predicate predicate);
    Find is(String field, Object value);
    Find regex(String field, String value);
    Find lt(String field, Object value);
    Find lte(String field, Object value);
    Find gt(String field, Object value);
    Find gte(String field, Object value);
    Find in(String field, Object... value);

    Find or(Find... finds);

}
