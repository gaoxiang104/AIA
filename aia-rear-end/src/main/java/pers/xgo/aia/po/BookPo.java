package pers.xgo.aia.po;

import pers.xgo.aia.enums.BookStatusEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 书籍 PO
 *
 * @author xgo
 */
public class BookPo implements Serializable {
    private static final long serialVersionUID = 1481150070428250910L;

    /**
     * id主键
     */
    private Long id;
    /**
     * 书名
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态
     */
    private BookStatusEnum status;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 修改时间
     */
    private Date updateAt;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BookStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BookStatusEnum status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"description\":\"")
                .append(description).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append(",\"createAt\":\"")
                .append(createAt).append('\"');
        sb.append(",\"updateAt\":\"")
                .append(updateAt).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
