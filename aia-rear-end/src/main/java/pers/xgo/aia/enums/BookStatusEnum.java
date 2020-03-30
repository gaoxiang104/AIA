package pers.xgo.aia.enums;

/**
 * 书籍状态 enum
 */
public enum BookStatusEnum implements MybatisEnum<BookStatusEnum, Integer> {

    UNREAD(0, "未阅读"),
    READING(1, "阅读中"),
    HAVE_READ(2, "已读完"),
    ;

    /**
     * key
     */
    private int key;
    /**
     * value
     */
    private String value;

    BookStatusEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public Integer getMybatisValue() {
        return this.getKey();
    }
}
