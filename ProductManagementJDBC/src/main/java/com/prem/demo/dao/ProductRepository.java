package com.prem.demo.dao;


import org.springframework.stereotype.Repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.prem.demo.model.Product;

@Repository
public class ProductRepository {

	Connection con=null;
	
	public ProductRepository()
	{
		try {
			
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prem","root","prem");
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

	public void add(Product prod) {
		
		String query="insert into product(name,type,place,warranty) values(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,prod.getName());
			ps.setString(2,prod.getType());
			ps.setString(3,prod.getPlace());
			ps.setInt(4,prod.getWarranty());
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Product> readAll() {
		String query="select name,type,place,warranty from product";
		List<Product> li=new ArrayList<>();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				Product temp=new Product();
				temp.setName(rs.getString(1));
				temp.setType(rs.getString(2));
				temp.setPlace(rs.getString(3));
				temp.setWarranty(rs.getInt(4));
				li.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}

	

	public List<Product> findProduct(String name) {
		List<Product> li=new ArrayList<>();
		String query="select name,type,place,warranty from product where name=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setName(rs.getString(1));
				p.setType(rs.getString(2));
				p.setPlace(rs.getString(3));
				p.setWarranty(rs.getInt(4));
				li.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

}
