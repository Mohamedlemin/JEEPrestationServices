package ChefService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import ChefService.metier.demande;

public class demandedaoImpl implements demandedao {

	@Override
	public List<demande> listDemande(Long id_chef) {
		List<demande> demandes=new ArrayList<demande>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT demande.id,demande.description,demande.delais,demande.status fROM demande,service where demande.service=service.id and service.id_chef=?");
			ps.setLong(1,id_chef);
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				demande c=new demande();
				c.setId(rs.getLong("id"));
				c.setDescription(rs.getString("description"));
				c.setDelais(rs.getString("delais"));
				c.setStatus(rs.getString("status"));
				
				
				demandes.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return demandes;
	}

	@Override
	public demande getDemande(Long id) {
		// TODO Auto-generated method stub
		
		demande c=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM demande where id=?");
			ps.setLong(1,id);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				c=new demande();
				c.setId(rs.getLong("id"));
				c.setDescription(rs.getString("description"));
				c.setDelais(rs.getString("delais"));
				c.setStatus(rs.getString("status"));
				c.setClient(rs.getInt("client"));
				c.setService(rs.getInt("service"));
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}
	
	

}
