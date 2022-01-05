package ChefService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ChefService.metier.chefprojet;
import ChefService.metier.projet;


public class projetdaoImpl implements projetdao{

	@Override
	public List<projet> listProjet(Long id_chef) {
		// TODO Auto-generated method stub
		
		
		List<projet> projets=new ArrayList<projet>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT projet.id,projet.description,projet.delais,projet.budge,projet.budgetTotal fROM projet,service where projet.service=service.id and service.id_chef=?");
			ps.setLong(1,id_chef);
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				projet c=new projet();
				c.setId(rs.getLong("id"));
				c.setDescription(rs.getString("description"));
				c.setDelais(rs.getString("delais"));
				c.setBudget(rs.getDouble("budge"));
				c.setBudgetTotal(rs.getDouble("budgetTotal"));
				
				
				projets.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projets;
		
	}

	@Override
	public void saveProjet(projet p) {
		// TODO Auto-generated method stub
		
		
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prep=connection.prepareStatement("insert into projet(description,delais,budgetTotal,budge,client,chefprojet,service) values(?,?,?,?,?,?,?)");
			
	     prep.setString(1,p.getDescription());
	     prep.setString(2, p.getDelais());
	     prep.setDouble(3, p.getBudgetTotal());
	     prep.setDouble(4, p.getBudget());
	     
	     prep.setLong(5, p.getClient());
	     prep.setLong(6, p.getChefprojet());
	     prep.setLong(7, p.getService());
	     prep.executeUpdate();
	     prep.close();
//	     PreparedStatement ps2=connection.prepareStatement("select MAX(id) as id from projet");
//	     ResultSet res=ps2.executeQuery();
//	     if(res.next()) {
//	    	 p.setId(res.getLong("id"));
//	     }
	     
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	
	}

	@Override
	public void deleteProjet(Long id) {
		// TODO Auto-generated method stub
		
         Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prep=connection.prepareStatement("delete from projet where id=?");
	
	     prep.setLong(1,id);
	     prep.executeUpdate();
	     prep.close();
	    
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateProjet(projet p) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prep=connection.prepareStatement("update projet set delais=?,budgetTotal=?,budge=?,chefprojet=? where id=?");
			
	     prep.setString(1,p.getDelais());
	     prep.setDouble(2, p.getBudgetTotal());
	     prep.setDouble(3, p.getBudget());
	     prep.setLong(4, p.getChefprojet());
	  
	     prep.setLong(5, p.getId());
	    
	     prep.executeUpdate();
	     prep.close();
	   
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public projet getProjet(Long id) {
		// TODO Auto-generated method stub
		
	  projet c=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM projet where id=?");
			ps.setLong(1,id);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				c=new projet();
				c.setId(rs.getLong("id"));
				c.setDescription(rs.getString("description"));
				c.setDelais(rs.getString("delais"));
				c.setBudget(rs.getDouble("budge"));
				c.setBudgetTotal(rs.getDouble("budgetTotal"));
				c.setChefprojet(rs.getLong("chefprojet"));
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
		
		
		
		
		
	}

}
