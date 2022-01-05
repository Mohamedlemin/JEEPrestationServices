package ChefService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ChefService.metier.chefprojet;
import ChefService.metier.membre;

public class membredaoImpl implements membredao{

	@Override
	public List<membre> listMembre(Long id_chef) {
		// TODO Auto-generated method stub
		
		List<membre> membres=new ArrayList<membre>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT membre.id,membre.nom,membre.prenom,membre.tel fROM membre,service where membre.service=service.id and service.id_chef=?");
			ps.setLong(1,id_chef);
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				membre c=new membre();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				
				c.setTel(rs.getString("tel"));
				
				
				membres.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return membres;
		
		
		
	
	}

	@Override
	public void saveMembre(membre p) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prep=connection.prepareStatement("insert into membre(nom,prenom,tel,service) values(?,?,?,?)");
			
	     prep.setString(1,p.getNom());
	     prep.setString(2, p.getPrenom());
	   
	     prep.setString(3, p.getTel());
	     prep.setLong(4, p.getService());
	   
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
	public void deleteMembre(Long id) {
		// TODO Auto-generated method stub
       Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prep=connection.prepareStatement("delete from membre where id=?");
	
	     prep.setLong(1,id);
	     prep.executeUpdate();
	     prep.close();
	    
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public membre getMembre(Long id) {
		// TODO Auto-generated method stub
		
		
		membre c=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM membre where id=?");
			ps.setLong(1,id);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				c=new membre();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				
				c.setTel(rs.getString("tel"));
				
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	
	}

	@Override
	public void updateMembre(membre p) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prep=connection.prepareStatement("update membre set nom=?,prenom=?,tel=? where id=?");
			
	     prep.setString(1,p.getNom());
	     prep.setString(2, p.getPrenom());
	     prep.setString(3, p.getTel());
	   
	     prep.setLong(4, p.getId());
	    
	     prep.executeUpdate();
	     prep.close();
	   
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<membre> MembreParMc(Long id_chef, String mc) {
		// TODO Auto-generated method stub
		
		List<membre> membres=new ArrayList<membre>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT membre.id,membre.nom,membre.prenom,membre.tel fROM membre,service where membre.service=service.id and service.id_chef=? and membre.nom like ?");
			ps.setLong(1,id_chef);
			ps.setString(2, "%"+mc+"%");
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
			membre c=new membre();
			c.setId(rs.getLong("id"));
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			
			c.setTel(rs.getString("tel"));
			membres.add(c);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return membres;
		
		
		
		
	
	}

}
