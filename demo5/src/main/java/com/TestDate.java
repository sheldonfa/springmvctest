package com;


import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fangxin
 * @date 2017/4/25.
 */
@Controller
/*@RequestMapping("根路径")*/
public class TestDate {

    /*请求http://localhost:8080/getTime.html?date=1992-09-01 12:01:01*/
    @RequestMapping("/getTime.html")
    public String getTime(Date date){
        System.out.println(date);
        return null;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 自动计算时间
        dateFormat.setLenient(true);
        // true 表示是否允许为空
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
