package cn.itcast.service.impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsSreviceImpl implements ItemsSrevice {
@Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {

        return  itemsDao.findById(id);

    }
}
