package com.coco.persistence;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coco.config.RootConfig;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataSource() {
		
		try(Connection conn = dataSource.getConnection();) {
			assertNotNull(conn);
			log.info(conn);
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
