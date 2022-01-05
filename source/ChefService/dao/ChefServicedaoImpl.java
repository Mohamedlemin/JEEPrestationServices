package ChefService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ChefService.metier.ChefService;

public class ChefServicedaoImpl implements ChefServicedao{

	@Override
	public ChefService login(String user, String password) {
		ChefService chef=new ChefService();
		chef.setId((long) 0);
		
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM chefservice where username=? and password=?");
			ps.setString(1,user);
			ps.setString(2,password);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				
				chef.setId(rs.getLong("id"));
				chef.setNom(rs.getString("Nom"));
				chef.setPrenom(rs.getString("Prenom"));
				chef.setTel(rs.getString("telephone"));
				chef.setUsername(rs.getString("username"));
				chef.setPassword(rs.getString("password"));
			
		}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chef;
		
		
		
		
		
	}

}
