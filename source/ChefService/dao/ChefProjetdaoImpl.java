package ChefService.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ChefService.metier.chefprojet;
import ChefService.metier.demande;



public class ChefProjetdaoImpl implements ChefProjetdao {

	@Override
	public List<chefprojet> listChefProjet(Long id_chef) {
		
		List<chefprojet> chefprojets=new ArrayList<chefprojet>();
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT chefprojet.id,chefprojet.Nom,chefprojet.Prenom,chefprojet.username,chefprojet.telephone fROM chefprojet,service where chefprojet.service=service.id and service.id_chef=?");
			ps.setLong(1,id_chef);
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				chefprojet c=new chefprojet();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setUsername(rs.getString("username"));
				c.setTel(rs.getString("telephone"));
				
				
				chefprojets.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chefprojets;
	}
		// TODO Auto-generated method stub

	@Override
	public void saveChefProjet(chefprojet p) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prep=connection.prepareStatement("insert into chefprojet(Nom,Prenom,username,password,telephone,service) values(?,?,?,?,?,?)");
			
	     prep.setString(1,p.getNom());
	     prep.setString(2, p.getPrenom());
	     prep.setString(3, p.getUsername());
	     prep.setString(4, p.getPassword());
	     prep.setString(5, p.getTel());
	     prep.setLong(6, p.getService());
	   
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
	public void deleteChef(Long id) {
		// TODO Auto-generated method stub
		
		Connection connection=SingletonConnection.getConnection();
		
		try {
			PreparedStatement prep=connection.prepareStatement("delete from chefprojet where id=?");
	
	     prep.setLong(1,id);
	     prep.executeUpdate();
	     prep.close();
	    
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

	@Override
	public chefprojet getChef(Long id) {
		// TODO Auto-generated method stub
		
		
		chefprojet c=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM chefprojet where id=?");
			ps.setLong(1,id);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				c=new chefprojet();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setUsername(rs.getString("username"));
				c.setTel(rs.getString("telephone"));
				c.setPassword(rs.getString("password"));
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
		
	}

	@Override
	public void updateChef(chefprojet p) {
		// TODO Auto-generated method stub
		
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement prep=connection.prepareStatement("update chefprojet set nom=?,prenom=?,telephone=?,username=?,password=? where id=?");
			
	     prep.setString(1,p.getNom());
	     prep.setString(2, p.getPrenom());
	     prep.setString(3, p.getTel());
	     prep.setString(4, p.getUsername());
	     prep.setString(5, p.getPassword());
	     prep.setLong(6, p.getId());
	    
	     prep.executeUpdate();
	     prep.close();
	   
	     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<chefprojet> ChefParMc(Long id_chef,String mc) {
		// TODO Auto-generated method stub
		List<chefprojet> chefprojets=new ArrayList<chefprojet>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT chefprojet.id,chefprojet.Nom,chefprojet.Prenom,chefprojet.username,chefprojet.telephone fROM chefprojet,service where chefprojet.service=service.id and service.id_chef=? and chefprojet.Nom like ?");
			ps.setLong(1,id_chef);
			ps.setString(2, "%"+mc+"%");
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				chefprojet c=new chefprojet();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setUsername(rs.getString("username"));
				c.setTel(rs.getString("telephone"));
				chefprojets.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chefprojets;
		
	}

	}


