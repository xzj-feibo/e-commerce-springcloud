package com.imooc.ecommerce.test;

import com.imooc.ecommerce.vo.CommonResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author FeiBo
 * @date 2023/9/17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test1 {
    @Test
    public void testEntity() {
        CommonResponse<String> re = new CommonResponse<>(0, "");
        re.setData("aaa");
        System.out.println(re);
    }
}
