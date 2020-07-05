package cn.please.ssm.dao;

import cn.please.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    @Select("select * form Product")
    public List<Product> findAll() throws Exception;
}
