import java.sql.*;
import java.util.ArrayList;

public class Controller {
    Connection conn = null;
    ResultSet rs = null;
    Statement st = null;
    String url = "jdbc:mysql://localhost:3306/items?user=root&password=1234";

    public Controller() {
        try {
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 상품 추가
    public void insertitem(Model model) {
        try {
            st = conn.createStatement();
            int stmt = st.executeUpdate(
                    "insert into item values ('" + model.price + "', '" + model.name + "', '" + model.num + "');");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 상품 목록 출력
    public ArrayList<Model> readitem() {
        ArrayList<Model> arr = new ArrayList<Model>();
        System.out.println(arr);
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from item;");
            while (rs.next()) {
                arr.add(new Model(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arr;
    }

    // 상품수정
    public void updateitem(String name, String num) {
        try {
            st = conn.createStatement();
            int stmt = st
                    .executeUpdate("update item set num = '" + num + "' where name = '" + name + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // (이름기준)상품삭제
    public void deleteitem(String name) {
        try {
            st = conn.createStatement();
            int stmt = st.executeUpdate("delete from item where name = '" + name + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // 상품 검색
    public ArrayList<Model> searchitem(String content) {
        ArrayList<Model> arr = new ArrayList<Model>();
        System.out.println(arr);
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from item where price like '%" + content + "%';");
            while (rs.next()) {
                arr.add(new Model(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arr;
    }
}