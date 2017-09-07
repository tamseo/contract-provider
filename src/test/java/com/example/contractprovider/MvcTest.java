package com.example.contractprovider;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public abstract class MvcTest {
    @Before
    public void setup() {
        RestAssuredMockMvc
                .standaloneSetup(new HelloController());
    }
}
