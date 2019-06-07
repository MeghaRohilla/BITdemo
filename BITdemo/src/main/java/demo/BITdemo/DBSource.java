package demo.BITdemo;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
@ComponentScan
public class DBSource {
	

	@Bean
	public DataSource dataSource() {
		try {
			String connString = "jdbc:oracle:thin:@10.200.76.107:1521:FXCAT";

			OracleDataSource ods = new OracleDataSource();
			ods.setURL(connString);
			ods.setUser("arbor22");
			ods.setPassword("arbor123");

			/*
			 * DriverManagerDataSource ds = new DriverManagerDataSource();
			 * ds.setDriverClassName("oracle.jdbc.pool.OracleDataSource");
			 * ds.setUrl("jdbc:oracle:thin:@10.200.76.107:1521:FXCAT");
			 * 
			 * ds.setUsername("arbor22"); ds.setPassword("arbor123");
			 */
			return ods;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
