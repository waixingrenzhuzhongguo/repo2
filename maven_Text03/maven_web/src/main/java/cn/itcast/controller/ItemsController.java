package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsSrevice itemsSrevice;
@RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items = itemsSrevice.findById(1);
            model.addAttribute("item",items);
            return "itemDetail";
    }
}
