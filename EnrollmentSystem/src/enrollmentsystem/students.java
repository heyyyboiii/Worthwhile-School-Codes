/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollmentsystem;

/**
 *
 * @author mercy
 */
public class students {
    int studID;
    String studName;
    String studAddress;
    String studCourse;
    String studGender;
    String studYearLvl;
    
    DBConnect connector = new DBConnect();
    
    public void AddStudents(int id, String name, String address, String course, String gender, String year){
        
        String query = "INSERT INTO students VALUES('" + id + "', '" + name + "', '" + address + "', '" + course + "', '" + gender + "', '" + year + "')";
        try{
            connector.st.executeUpdate(query);
        }catch(Exception ex){
            System.out.println("Failed to Insert");
            System.out.println(ex);
        }
    }
    
    public void UpdateStudents(int id, String name, String address, String course, String gender, String year){
        
        String upQuery = "UPDATE students SET studName='"+name+"', studAddress='"+address+"', studCourse='"+course+"', studGender='"+gender+"', studYearLvl='" + year + "' WHERE studID = '"+id+"'";
        try{
            connector.pst = connector.con.prepareStatement(upQuery);
            connector.pst.execute();
        }catch(Exception ex){
            System.out.println("Failed to Update");
            System.out.println(ex);
        }

    }
    public void DeleteStudent(String delete){
        if(delete.equals(";")){
            delete = "";
        }
        String delQuery = "DELETE FROM students WHERE studID in (SELECT studID from (SELECT * FROM students " + delete + ") as x)";
        try{
            connector.st.executeUpdate(delQuery);
        }catch(Exception ex){
            System.out.println("Failed to Delete");
            System.out.println(ex);
        }
    }
    
}
