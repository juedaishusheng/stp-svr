package com.el.dev

import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

/**
 * Created on 16/3/14.
 *
 * @author panlw
 */
class DevGreetingControllerSpec extends Specification {

    private MockMvc mockMvc

    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new DevGreetingController()).build();
    }

    def "[DEV] 打一个招呼"() {
        when:
        def response = mockMvc.perform(get("/dev/greeting?name=SMS"))

        then:
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().string('{"id":1,"content":"Hello, SMS!"}'))
                .andExpect(jsonPath('$.content').value("Hello, SMS!"))
    }

}
