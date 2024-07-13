package io.github.erictowns.entity;

/**
 * desc:
 *
 * @author EricTownsChina@outlook.com
 * @date 2024-07-13 22:53
 */
public class Expression extends Criteria {

    @Override
    protected boolean express() {
        return true;
    }

    private String key;

    private String comparator;

    private Object value;

    public Expression() {
    }

    public Expression(String key, String comparator, Object value) {
        this.key = key;
        this.comparator = comparator;
        this.value = value;
    }

    public static Expression of(String key, String comparator, Object value) {
        return new Expression(key, comparator, value);
    }

    public String getKey() {
        return key;
    }

    public Expression setKey(String key) {
        this.key = key;
        return this;
    }

    public String getComparator() {
        return comparator;
    }

    public Expression setComparator(String comparator) {
        this.comparator = comparator;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public Expression setValue(Object value) {
        this.value = value;
        return this;
    }


}
