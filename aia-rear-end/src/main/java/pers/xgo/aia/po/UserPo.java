package pers.xgo.aia.po;

import java.io.Serializable;

public class UserPo implements Serializable {
    private static final long serialVersionUID = 946394979464819764L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserPo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
