package Accueil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Accueil.metier.client;
import Accueil.metier.demande;



public class clientdaoimpl implements Iclientdao{

	@Override
	public client save(client c) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO client(Nom,Prenom,telephone,username,password,type) VALUES(?,?,?,?,?,?)");
		ps.setString(1,c.getNom());
		ps.setString(2,c.getPrenom());
		ps.setString(3,c.getTelephone());
		ps.setString(4,c.getUsername());
		ps.setString(5,c.getPassword());
		ps.setString(6,c.getType());
		ps.executeUpdate();	
		PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID) as MAX_ID fROM client");
		ResultSet  rs=ps2.executeQuery();
		if(rs.next()) {
			c.setId(rs.getLong("MAX_ID"));
		}
		ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public client getclient(long id) {
		client c=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM client where id=?");
			ps.setLong(1,id);
			ResultSet  rs=ps.executeQuery();
			if(rs.next()) {
				c=new client();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setTelephone(rs.getString("telephone"));
				c.setUsername(rs.getString("username"));
				c.setPassword(rs.getString("password"));
				c.setType(rs.getString("type"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public client update(client c) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("UPDATE client SET Nom=?,Prenom=?,telephone=?,username=?, password=?,type=? where id=?");
			ps.setString(1,c.getNom());
			ps.setString(2,c.getPrenom());
			ps.setString(3,c.getTelephone());
			ps.setString(4,c.getUsername());
			ps.setString(5,c.getPassword());
			ps.setLong(7,c.getId());
			ps.setString(6,c.getType());
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

	@Override
	public void deleteclient(long id) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("DELETE FROM client WHERE ID=?");
		ps.setLong(1,id);
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	@Override
	public List<client> clientParMC() {
		List<client> clients=new ArrayList<client>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM client");
			
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				client c=new client();
				c.setId(rs.getLong("id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setTelephone(rs.getString("telephone"));
				c.setUsername(rs.getString("username"));
				c.setPassword(rs.getString("password"));
				c.setType(rs.getString("type"));
				
				clients.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clients;
	}

	@Override
	public demande saved(demande c) {
		Connection connection=SingletonConnection.getConnection();
		try {
			
			
			PreparedStatement ps1=connection.prepareStatement("SELECT id as client1 fROM client where client.Nom=?");
			ps1.setString(1,c.getClient());
			ResultSet  rs1=ps1.executeQuery();
			if(rs1.next()) {
				c.setClient(rs1.getString("client1"));
			}
			
			PreparedStatement ps3=connection.prepareStatement("SELECT id as service1 fROM service where nams=?");
			ps3.setString(1,c.getService());
			ResultSet  rs2=ps3.executeQuery();
			if(rs2.next()) {
				c.setService(rs2.getString("service1"));
			}
			
			PreparedStatement ps4=connection.prepareStatement("SELECT id as accueil1 fROM accueil where Noma=?");
			ps4.setString(1,c.getAccuiel());
			ResultSet  rs4=ps4.executeQuery();
			if(rs4.next()) {
				c.setAccuiel(rs4.getString("accueil1"));
			}
			 		
		PreparedStatement ps=connection.prepareStatement("INSERT INTO demande(description,client,accueil,service,date_creation,status) VALUES(?,?,?,?,?,?)");
		ps.setString(1,c.getDescription());
	    ps.setString(2,c.getClient());
        ps.setString(3,c.getAccuiel());
        ps.setString(4,c.getService());
		ps.setString(5,c.getDate_creation());
		ps.setString(6,c.getStatus());
		ps.executeUpdate();	
		PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id) as MAX_ID fROM demande");
		ResultSet  rs=ps2.executeQuery();
		if(rs.next()) {
			c.setId(rs.getLong("MAX_ID"));
		}
		
		ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<demande> demandeParMC() {
		List<demande> demandes=new ArrayList<demande>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * fROM demande JOIN accueil JOIN service JOIN client where accueil.id=demande.accueil and service.id=demande.service and client.id=demande.client");
			
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				demande c=new demande();
				c.setId(rs.getLong("id"));
				c.setDescription(rs.getString("description"));
				c.setClient(rs.getString("Nom"));
				c.setAccuiel(rs.getString("Noma"));
				c.setService(rs.getString("nams"));
				c.setDate_creation(rs.getString("date_creation"));
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
	public demande getdemande(long id) {
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
				c.setClient(rs.getString("client"));
				c.setAccuiel(rs.getString("accueil"));
				c.setService(rs.getString("service"));
				c.setDate_creation(rs.getString("date_creation"));
				c.setStatus(rs.getString("status"));
			}
			PreparedStatement ps1=connection.prepareStatement("SELECT id as client1 fROM client where client.Nom=?");
			ps1.setString(1,rs.getString("client"));
			ResultSet  rs1=ps1.executeQuery();
			if(rs1.next()) {
				c.setClient(rs1.getString("client1"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public demande updatedemande(demande c) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps1=connection.prepareStatement("SELECT id as client1 fROM client where client.Nom=?");
			ps1.setString(1,c.getClient());
			ResultSet  rs1=ps1.executeQuery();
			if(rs1.next()) {
				c.setClient(rs1.getString("client1"));
			}
			
			PreparedStatement ps3=connection.prepareStatement("SELECT id as service1 fROM service where nams=?");
			ps3.setString(1,c.getService());
			ResultSet  rs2=ps3.executeQuery();
			if(rs2.next()) {
				c.setService(rs2.getString("service1"));
			}
			
			PreparedStatement ps4=connection.prepareStatement("SELECT id as accueil1 fROM accueil where Noma=?");
			ps4.setString(1,c.getAccuiel());
			ResultSet  rs4=ps4.executeQuery();
			if(rs4.next()) {
				c.setAccuiel(rs4.getString("accueil1"));
			}
			PreparedStatement ps=connection.prepareStatement("UPDATE demande SET description=?,client=?,accueil=?,service=?,date_creation=?,status=? where id=?");
			ps.setString(1,c.getDescription());
		    ps.setString(2,c.getClient());
	        ps.setString(3,c.getAccuiel());
	        ps.setString(4,c.getService());
			ps.setString(5,c.getDate_creation());
			ps.setString(6,c.getStatus());
			ps.setLong(7,c.getId());
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}

	@Override
	public void deletedemande(long id) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("DELETE FROM demande WHERE ID=?");
		ps.setLong(1,id);
		ps.executeUpdate();
		ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<String> serviceParMC() {
		List<String> services=new ArrayList<String>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT nams as service fROM service");
			
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				String c=rs.getString("service");
				
				
				services.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return services;
	}

	@Override
	public List<String> aParMC() {
		List<String> services=new ArrayList<String>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT Noma as service fROM accueil");
			
			ResultSet  rs=ps.executeQuery();
			while(rs.next()) {
				String c=rs.getString("service");
				
				
				services.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return services;
	}

	
	}


