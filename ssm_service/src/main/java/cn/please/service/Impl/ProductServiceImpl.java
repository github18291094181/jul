package cn.please.service.Impl;

import cn.please.service.IProductService;
import cn.please.ssm.dao.IProductDao;
import cn.please.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Controller
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findall() throws Exception {
        return productDao.findAll();
    }
}
