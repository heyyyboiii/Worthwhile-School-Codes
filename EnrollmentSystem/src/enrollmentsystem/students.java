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
        
        String query = "insert into students values(" + id + ", " + name + ", " + address + ", " + course + ", " + gender + ", " + year + ")";
        try{
            connector.st.executeUpdate(query);
        }catch(Exception ex){
            System.out.println("Failed to Insert");
            System.out.println(query);
        }
    }
    
}
