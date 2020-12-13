package database;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class DataFunc {

    Connection con = Connections.Newconnect();

    public ArrayList<User> getUserList() {

        PreparedStatement stm = null;
        ResultSet rs = null;
        ArrayList<User> uslist = new ArrayList<User>();
        try {
            String sql = "Select * from user";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                User us = new User();
                us.setId(rs.getInt(1));
                us.setUserName(rs.getString(2));
                us.setPassWord(rs.getString(3));
                us.setOnline(rs.getInt(4));
                us.setPoint(rs.getFloat(5));
                us.setTop1(rs.getInt(6));
                us.setTop2(rs.getInt(7));
                us.setTop3(rs.getInt(8));
                us.setTop4(rs.getInt(9));
                uslist.add(us);
            }
        } catch (SQLException ex) {
        }
        return uslist;
    }

    public ArrayList<User> getUserRank() {
        PreparedStatement stm = null;
        ResultSet rs = null;
        ArrayList<User> uslist = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM user ORDER BY point DESC";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                User us = new User();
                us.setId(rs.getInt(1));
                us.setUserName(rs.getString(2));
                us.setPassWord(rs.getString(3));
                us.setOnline(rs.getInt(4));
                us.setPoint(rs.getFloat(5));
                us.setTop1(rs.getInt(6));
                us.setTop2(rs.getInt(7));
                us.setTop3(rs.getInt(8));
                us.setTop4(rs.getInt(9));
                uslist.add(us);
            }
        } catch (SQLException ex) {
        }
        return uslist;
    }

    public boolean updateUser(User user) throws SQLException {
        String sqlStatement
                = "update user set status = ? where userID = ?";
        PreparedStatement updateQuery = con.prepareStatement(sqlStatement);
        updateQuery.setInt(1, user.getOnline());
        updateQuery.setInt(2, user.getId());
        updateQuery.execute();
        return true;
    }

    public void updateDiem(User user, int rank) {
        try {
            String sql = "UPDATE user SET point = ?";
            String where = " WHERE userID = ?";

            switch (rank) {
                case 0:
                    sql += ",top1 = top1 + 1";
                    break;
                case 1:
                    sql += ",top2 = top2 + 1";
                    break;
                case 2:
                    sql += ",top3 = top3 + 1";
                    break;
                case 3:
                    sql += ",top4 = top4 + 1";
                    break;
            }
            sql += " WHERE userID = ?";
            PreparedStatement updateQuery = con.prepareStatement(sql);
            updateQuery.setFloat(1, user.getPoint());
            updateQuery.setInt(2, user.getId());
            updateQuery.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DataFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
