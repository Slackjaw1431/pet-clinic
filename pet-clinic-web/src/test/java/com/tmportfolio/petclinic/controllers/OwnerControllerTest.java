package com.tmportfolio.petclinic.controllers;

import com.tmportfolio.petclinic.model.Owner;
import com.tmportfolio.petclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;
    @InjectMocks
    OwnerController ownerController;

    MockMvc mockMvc;
    Set<Owner> owners;

    @BeforeEach
    void setUp() {
        owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();//set up mock environment with mock spring context
    }

    @Test
    void listOwners() throws Exception {
        when(ownerService.findAll()).thenReturn(owners);

        mockMvc.perform(get("owners"))//request mapping input
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))//return string output expected
                .andExpect(model().attribute("owners", hasSize(2)));//return object assessment
    }

    @Test
    void listOwnersByIndex() throws Exception {
        when(ownerService.findAll()).thenReturn(owners);

        mockMvc.perform(get("/owners/index/"))//request mapping input
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))//return string output expected
                .andExpect(model().attribute("owners", hasSize(2)));//return object assessment
    }

    @Test
    void findOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("notimplemented"));
        verifyNoInteractions(ownerService);
    }

    @Test
    void error() throws Exception {
        mockMvc.perform(get("/oops"))
                .andExpect(status().isOk())
                .andExpect(view().name("error"));
    }
}