package com.evoke.nykaaapp;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.evoke.nykaaapp.entity.ItemEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemControllerTest {
	@Autowired
	private WebApplicationContext webApplicationContext;
	private static MockMvc mockMvc;

	@BeforeEach
	public void setup() {
		if (mockMvc == null) {
			synchronized (ItemControllerTest.class) {
				if (mockMvc == null) {
					mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

				}
			}
		}
	}

	@Test
	public void testGetById() throws Exception {
		mockMvc.perform(get("/nykaaapp/api/items/100")).andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("samsung j8"));
	}
	@Test
	public void testCreateItem() throws Exception {
		ItemEntity order = new ItemEntity( 36l, "bottle", "shg", "plastic", "blue", "milton", 5, 21);
		ObjectMapper objectMapper = new ObjectMapper();
		String s = objectMapper.writeValueAsString(order);
		MvcResult mvcResult = mockMvc
				.perform(post("/nykaaapp/api/items").contentType(MediaType.APPLICATION_JSON).content(s)).andReturn();
		assertEquals(200, mvcResult.getResponse().getStatus());
	}
}
