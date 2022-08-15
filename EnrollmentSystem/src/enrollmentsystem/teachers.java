/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollmentsystem;

/**
 *
 * @author mercy
 */
public class teachers {
    int teachID;
    String teachName;
    String teachDept;
    String teachAddress;
    String teachContact;
    String teachStatust;
    
    DBConnect connector = new DBConnect();
    
    public void AddTeachers(int id, String name, String dept, String address, String contact, String status){
        
        String query = "INSERT INTO teachers VALUES('" + id + "', '" + name + "', '" + dept + "', '" + address + "', '" + contact + "', '" + status + "')";
        try{
            connector.st.executeUpdate(query);
        }catch(Exception ex){
            System.out.println("Failed to Insert");
            System.out.println(ex);
        }
    }
    
    public void UpdateTeachers(int id, String name, String dept, String address, String contact, String status){
        
        String upQuery = "UPDATE teachers SET teachName='"+name+"', teachDept='"+dept+"', teachAddress='"+address+"', teachContact='"+contact+"', teachStatust='" + status + "' WHERE teachID = '"+id+"'";
        try{
            connector.pst = connector.con.prepareStatement(upQuery);
            connector.pst.execute();
        }catch(Exception ex){
            System.out.println("Failed to Update");
            System.out.println(ex);
        }
    }
    public void DeleteTeachers(String delete){
        if(delete.equals(";")){
            delete = "";
        }
        String delQuery = "DELETE FROM teachers WHERE teachID in (SELECT teachID from (SELECT * FROM teachers " + delete + ") as x)";
        try{
            connector.st.executeUpdate(delQuery);
        }catch(Exception ex){
            System.out.println("Failed to Delete");
            System.out.println(ex);
        }
    }
}