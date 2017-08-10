package com.iim.test.base;


import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xibin on 2017/8/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = com.iim.Application.class)
@SpringBootTest(classes = com.iim.Application.class)
public class BaseTest extends TestCase {

}
