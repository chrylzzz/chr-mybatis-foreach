package com.chryl;

import com.chryl.mapper.ForeachMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChrMybatisForeachApplicationTests {

	@Resource
	private ForeachMapper foreachMapper;
	@Test
	public void contextLoads() {
		List<String> ids=new ArrayList<>();
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
		List<String> ids=new ArrayList<>();
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
		List<String> ids=new ArrayList<>();
		ids.add("223");
		ids.add("224");
		ids.add("225");
		ids.add("226");
		ids.add("217");
		int nancy = foreachMapper.inserts("nancy", ids);
		System.out.println(nancy);
	}
}
