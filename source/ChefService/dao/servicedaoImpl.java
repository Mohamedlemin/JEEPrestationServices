package ChefService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ChefService.metier.Service;
import ChefService.metier.demande;

public class servicedaoImpl implements servicedao{

	@Override
	public Service getService(Long id_chef) {
		// TODO Auto-generated method stub
		
		
		Service c=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM service where id_chef=?");
			ps.setLong(1,id_chef);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				c=new Service();
				c.setId(rs.getLong("id"));
				c.setNams(rs.getString("nams"));
				c.setId_chef(rs.getLong("id_chef"));
		
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
		
		
		
		
		
		
	
	}

}
