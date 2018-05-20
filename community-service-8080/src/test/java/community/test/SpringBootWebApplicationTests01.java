package community.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringBootWebApplicationTests01.class)
public class SpringBootWebApplicationTests01 {
	@Autowired
	private DataSource dataSource;

	@Test
	public void test() {
		System.out.println();
	}
	@Test
	public void contextLoads() throws SQLException {
		System.out.println("aaa");
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
	}


}
