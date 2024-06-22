/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import controller.productList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.brand;
import model.product;
import model.dao.ProductLista;
/**
 *
 * @author tran tung
 */
public class productListDAO extends DBContext{
    public List<model.dao.ProductLista> getProductList() {
        List<model.dao.ProductLista> productList = new ArrayList<>();
        String sql = "SELECT * FROM product p JOIN brand b ON p.brandID = b.id ";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductLista p = new ProductLista();
                productList.add(new ProductLista(
       
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),
                rs.getInt(13),rs.getInt(14),rs.getString(15)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
   
    public List<model.dao.ProductLista> getPhoneList() {
        List<model.dao.ProductLista> productList = new ArrayList<>();
        String sql = "SELECT * FROM product p JOIN brand b ON p.brandID = b.id where categoryID = 1";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { 
                
                ProductLista p = new ProductLista();
                productList.add(new ProductLista(
       
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),
                rs.getInt(13),rs.getInt(14),rs.getString(15)));
                
}
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
    public List<model.dao.ProductLista> getLaptopList() {
        List<model.dao.ProductLista> productList = new ArrayList<>();
        String sql = "SELECT * FROM product p JOIN brand b ON p.brandID = b.id where categoryID = 2";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                 ProductLista p = new ProductLista();
                productList.add(new ProductLista(
       
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),
                rs.getInt(13),rs.getInt(14),rs.getString(15)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
    public List<model.dao.ProductLista> getTabletList() {
        List<model.dao.ProductLista> productList = new ArrayList<>();
        String sql = "SELECT * FROM product p JOIN brand b ON p.brandID = b.id where categoryID = 3";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            ProductLista p = new ProductLista();
                productList.add(new ProductLista(
      
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),
                rs.getInt(13),rs.getInt(14),rs.getString(15)));
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;
    }
       public List<model.dao.ProductLista> getAccessoryList() {
List<model.dao.ProductLista> productList = new ArrayList<>();
        String sql = "SELECT * FROM product p JOIN brand b ON p.brandID = b.id where categoryID = 4";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            ProductLista p = new ProductLista();
                productList.add(new ProductLista(
      
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),
                rs.getInt(13),rs.getInt(14),rs.getString(15)));
            
            
            
            
            }
            System.out.println(productList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return productList;    }
    
    
    
    
    public String getBrandName(int id) {
        String sql = "SELECT brandName FROM dbo.brand WHERE id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("brandName");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
        
        
        
        
    }
     public static void main(String[] args) {
        productListDAO dao = new productListDAO();
        List<ProductLista> pr = dao.getProductList();
        for(int i =0;i<pr.size();i++){
            System.out.println(pr);
            
        }
           
        
  
    
    
    
    
    }

 
}