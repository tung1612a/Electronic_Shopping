/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.comment;
import model.dao.ProductLista;
import model.product;
import model.productSpecifications;

/**
 *
 * @author tran tung
 */

    public class productSpecificationsDAO extends dal.DBContext {

    public productSpecifications getSpecifications(String productID) {
    String sql = "SELECT * FROM product_specifications WHERE productID=?";
    productSpecifications p = new productSpecifications();
    try {
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, productID);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            p.setProductID(rs.getString("productID"));
            p.setSreensize(rs.getString("screensize"));
            p.setCPU(rs.getString("CPU"));
            p.setRAM(rs.getString("RAM"));
            p.setStorageCapacity(rs.getString("storageCapacity"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return p;
}

    public product getInfoProduct(String productID) {
    String sql = "SELECT * FROM product WHERE id = ?";
    product pr = new product();
    try {
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, productID);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            pr.setId(rs.getString(1));
            pr.setName(rs.getString(2));
            pr.setDescription(rs.getString(3));
            pr.setRelease_date(rs.getDate(4));
            pr.setPrice(rs.getInt(5));
            pr.setQuality(rs.getInt(6));
            pr.setUrl_img1(rs.getString(7));
            pr.setUrl_img2(rs.getString(8));
            pr.setUrl_img3(rs.getString(9));
            pr.setUrl_img4(rs.getString(10));
            pr.setUrl_img5(rs.getString(11));
            pr.setCategoryID(rs.getInt(12));
            pr.setBrandID(rs.getInt(13));
        
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return pr;
}


    
    public List<comment> getComment(String productID){
         List<comment> commentList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.comment where productID = ?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
                    st.setString(1, productID);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                commentList.add(new comment(rs.getInt(1),rs.getInt(2), rs.getString(3),rs.getDate(4),rs.getString(5)));
            }
            System.out.println(commentList);

        } catch (Exception e) {
            System.out.println(e);
        }
        return commentList;
    }
  
    
    
    
    public static void main(String[] args) {
        productSpecificationsDAO db = new productSpecificationsDAO();
         
        List<comment> c = db.getComment("ip151");
        for(int i =0;i<c.size();i++){
            System.out.println(c);
            
        
        
        
        
    }
}
    }
