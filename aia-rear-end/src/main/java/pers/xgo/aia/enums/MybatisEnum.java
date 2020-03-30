package pers.xgo.aia.enums;

public interface MybatisEnum<E extends Enum<?>, T> {
    T getMybatisValue();
}
