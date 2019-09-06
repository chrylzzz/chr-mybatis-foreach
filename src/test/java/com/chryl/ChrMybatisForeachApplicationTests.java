package com.chryl;

import com.chryl.mapper.ForeachMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChrMybatisForeachApplicationTests {

    @Resource
    private ForeachMapper foreachMapper;

    @Test
    public void contextLoads() {
        List<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("123");
        ids.add("124");
        ids.add("125");
        ids.add("1256");
        ids.add("234");
        ids.add("5463");
        int i = foreachMapper.deleteIds(ids);
        System.out.println(i);
    }

    @Test
    public void contextLoads2() {
        List<String> ids = new ArrayList<>();
        ids.add("123");
        ids.add("122");
        ids.add("1133");
        ids.add("125");
        ids.add("113");
        int nancy = foreachMapper.inserts("nancy", ids);
        System.out.println(nancy);
    }

    @Test
    public void contextLoads3() {
        Map<String, String> map = new HashMap<>();
        map.put("123", "nanc");
        map.put("122", "nanc");
        map.put("1133", "nanc");
        map.put("113", "nanc");
        map.put("125", "nanc");
        map.put("157", "nanc");
        map.put("23", "nanc");
        int i = foreachMapper.updateBatch(map);
        System.out.println(i);

    }
}
