package top.mrys.mongohelper;

import java.util.function.Predicate;

/**
 * @author mrys
 * @date 2020/8/1
 */
public class SpringTemplateFind implements Find {
    @Override
    public Find and() {
        return null;
    }

    @Override
    public Find and(Predicate predicate) {
        return null;
    }

    @Override
    public Find is(String field, Object value) {
        return null;
    }

    @Override
    public Find regex(String field, String value) {
        return null;
    }

    @Override
    public Find lt(String field, Object value) {
        return null;
    }

    @Override
    public Find lte(String field, Object value) {
        return null;
    }

    @Override
    public Find gt(String field, Object value) {
        return null;
    }

    @Override
    public Find gte(String field, Object value) {
        return null;
    }

    @Override
    public Find in(String field, Object... value) {
        return null;
    }

    @Override
    public Find or(Find... finds) {
        return null;
    }
}
