package com.congzhou;

import com.alibaba.fastjson.JSONObject;
import com.congzhou.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SpringbootMavenDemoApplicationTests {

    @BeforeAll
    public static void beforeTest(){
        System.out.println("test is beginning");
    }

    @Test
    void contextLoads() {
    }


    @Test
    public void testJSON() {
        // HashMap toJSONString
        HashMap<String, Object> oneHashMap = new HashMap<>();
        oneHashMap.put("a", 1);
        oneHashMap.put("b", 2);
        String oneJsonString = JSONObject.toJSONString(oneHashMap);
        System.out.println(oneJsonString);

        // JavaObject toJSONString
        User oneUser = new User();
        oneUser.setId("id_12345");
        oneUser.setAge(17);
        oneUser.setName("joe");
        oneJsonString = JSONObject.toJSONString(oneUser);
        System.out.println(JSONObject.toJSONString(oneJsonString));
    }

}
