/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class AddAdminClass {

    private int User_id;
    private String user_name;
    private String name;
    private String password;
    private String re_enterPassword;

    public AddAdminClass(int User_id, String user_name, String name, String password, String re_enterPassword) {
        this.User_id = User_id;
        this.user_name = user_name;
        this.name = name;
        this.password = password;
        this.re_enterPassword = re_enterPassword;
    }

    /**
     * @return the User_id
     */
    public int getUser_id() {
        return User_id;
    }

    /**
     * @param User_id the User_id to set
     */
    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the re_enterPassword
     */
    public String getRe_enterPassword() {
        return re_enterPassword;
    }

    /**
     * @param re_enterPassword the re_enterPassword to set
     */
    public void setRe_enterPassword(String re_enterPassword) {
        this.re_enterPassword = re_enterPassword;
    }

   
}
