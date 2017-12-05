package ares.remoting.test;

import java.util.List;

/**
 * Created by yangyuan on 11/27/17.
 */
public interface TestService {
    String test(String name);
    List<String> genericTest();
}
