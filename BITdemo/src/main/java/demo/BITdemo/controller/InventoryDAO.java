package demo.BITdemo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryDAO implements Dao<Inventory>{
	
	@Autowired
	  private DataSource dataSource;
	  private JdbcTemplate jdbcTemplate;

	  @PostConstruct
	  private void postConstruct() {
	      jdbcTemplate = new JdbcTemplate(dataSource);
	  }

	  @Override
	  public void save(Inventory person) {
	     /* String sql = "insert into Person values (sq_person.nextval, ?, ?, ?)";
	      jdbcTemplate.update(sql, person.getFirstName(),
	              person.getLastName(), person.getAddress());*/
	  }
	  @Override
	  public List<Inventory> loadAll() {
	      return jdbcTemplate.query("select * from temp_Inventory", (resultSet, i) -> {
	          return toInventory(resultSet);
	      });
	  }

	@Override
	public Inventory load(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Inventory t) {
		// TODO Auto-generated method stub
		
	}
	
    private Inventory toInventory(ResultSet resultSet) throws SQLException {
        Inventory inventory = new Inventory();
        inventory.setId(resultSet.getLong("ID"));
        inventory.setFirstName(resultSet.getString("FIRST_NAME"));
        inventory.setLastName(resultSet.getString("LAST_NAME"));
        inventory.setAddress(resultSet.getString("ADDRESS"));
        return inventory;
    }

}
