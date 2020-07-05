package cn.please.service;

import cn.please.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findall() throws Exception;
}
