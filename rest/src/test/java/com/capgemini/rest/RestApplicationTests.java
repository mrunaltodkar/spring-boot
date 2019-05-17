package com.capgemini.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.capgemini.rest.controller.DemoController;
import com.capgemini.rest.entity.Person;
import com.capgemini.rest.service.PersonService;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
public class RestApplicationTests {
	
	@MockBean
	private  PersonService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private DemoController controller;

	Person person = new Person(101, "Mrunal");

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void testAddNewPerson() {
		Mockito.when(service.addPerson(person)).thenReturn(person);
	}
	
	@Test
	public void testPersonId() {
		assertEquals(101,controller.addPerson().getPersonId());
	}
	
	@Test
	public void testPersonName() {
		assertEquals("Mrunal",controller.addPerson().getPersonName());
	}
	
	@Test
	public void testFindById() throws Exception {
		Person person = new Person(101,"Mrunal");
		when(service.findById(101)).thenReturn(person);
		mockMvc.perform(get("/byId/101")).andExpect(MockMvcResultMatchers.jsonPath("$.personId",is(101)));
		
	}
	
	@Test
	public void testIdNotFound() throws Exception {
		Person person = new Person(101,"Mrunal");
		when(service.findById(102)).thenReturn(person);
		mockMvc.perform(get("byId/101")).andExpect(status().isNotFound());
	}

}
