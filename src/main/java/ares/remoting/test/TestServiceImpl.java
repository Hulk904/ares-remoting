package ares.remoting.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yangyuan on 11/27/17.
 */
public class TestServiceImpl implements TestService{
    @Override
    public String test(String name){
        return "back==>" + name;
    }

    @Override
    public List<String> genericTest(){
        List list = new ArrayList();
        list.add("abc");
        list.add(new Date());
        return list;
    }
}
