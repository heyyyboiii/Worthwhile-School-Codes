/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollmentsystem;

/**
 *
 * @author mercy
 */
public class subjects {
    int subID;
    String subOde;
    String subDescription;
    int subUnits;
    String subSchedule;
    
    DBConnect connector = new DBConnect();
    
    public void AddSubjects(int id, String ode, String description, int units, String schedule){
        
        String query = "INSERT INTO subjects VALUES('" + id + "', '" + ode + "', '" + description + "', '" + units + "', '" + schedule + "')";
        try{
            connector.st.executeUpdate(query);
        }catch(Exception ex){
            System.out.println("Failed to Insert");
            System.out.println(ex);
        }
    }
    
    public void UpdateSubjects(int id, String ode, String description, int units, String schedule){
        
        String upQuery = "UPDATE subjects SET subOde='"+ode+"', subDescription='"+description+"', subUnits='"+units+"', subSchedule='"+schedule+"' WHERE subID = '"+id+"'";
        try{
            connector.pst = connector.con.prepareStatement(upQuery);
            connector.pst.execute();
        }catch(Exception ex){
            System.out.println("Failed to Update");
            System.out.println(ex);
        }
    }
    public void DeleteSubjects(String delete){
        if(delete.equals(";")){
            delete = "";
        }
        String delQuery = "DELETE FROM subjects WHERE subID in (SELECT subID from (SELECT * FROM subjects " + delete + ") as x)";
        try{
            connector.st.executeUpdate(delQuery);
        }catch(Exception ex){
            System.out.println("Failed to Delete");
            System.out.println(ex);
        }
    }
}
