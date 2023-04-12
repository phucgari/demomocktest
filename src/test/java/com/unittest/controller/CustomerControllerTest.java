package com.unittest.controller;

import com.unittest.service.CustomerServiceImpl;
import com.unittest.service.ICustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
class CustomerControllerTest {
    private ICustomerService customerService = Mockito.mock(CustomerServiceImpl.class);

    private MockMvc mockMvc;

    @InjectMocks
    private CustomerController customerController;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(customerController)
                .build();
    }
}