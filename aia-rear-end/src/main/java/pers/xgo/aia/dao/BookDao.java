package pers.xgo.aia.dao;

import org.apache.ibatis.annotations.Mapper;
import pers.xgo.aia.po.BookPo;

import java.util.List;

@Mapper
public interface BookDao {

    /**
     * 保存
     * @param bookPo
     * @return
     */
    Integer insert(BookPo bookPo);

    /**
     *
     * @param bookPo
     */
    Integer update(BookPo bookPo);

    /**
     * 查询列表，分页
     * @param offset
     * @param rowCount
     * @return
     */
    List<BookPo> selectList(Integer offset,Integer rowCount);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    BookPo selectOne(Long id);

}
