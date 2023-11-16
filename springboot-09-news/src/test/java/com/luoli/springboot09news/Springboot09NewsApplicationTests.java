package com.luoli.springboot09news;

import com.alibaba.fastjson.JSONObject;
import com.sun.deploy.net.URLEncoder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot09NewsApplicationTests {

    @Test
    void contextLoads() {
//        JSONObject json = new JSONObject();//new一个json对象
//        Map<String,Object> map = new HashMap<String, Object>();//new一个map集合
//        map.put("year","2022%00");
//        map.put("items","[0,[0],0]");
//        json.put("Information", map);//将数据放入json中   注：若将此json数据放入url地址栏中会，程序运行时会报错，所以需进行操做
//        String tojsonstring=json.toJSONString();//将json格式的数据转换为字符格式
//        try {
//            tojsonstring= URLEncoder.encode(tojsonstring,"utf-8");//将数据进行编码
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        String url ="http://test.dian111.com/ems/callout?content="+tojsonstring;
//        System.out.println(url);



    }


}
