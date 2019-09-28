package com.dashan.news;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewsApplicationTests {

    @Test
    public void contextLoads() {
        String str = "shangchun";
//        str +='s';
//        str = str+100;
//        int s = str.length;
//        str = 11;
        System.out.println();
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
