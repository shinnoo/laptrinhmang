/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;


public class KMessage implements Serializable{
    private int type;
    private Object object;
    private ArrayList<User> lstUser;

    public KMessage() {
    }

    public KMessage(int type, ArrayList<User> lstUser) {
        this.type = type;
        this.lstUser = lstUser;
    }


    public KMessage(int type, Object object) {
        this.type = type;
        this.object = object;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ArrayList<User> getLstUser() {
        return lstUser;
    }

    public void setLstUser(ArrayList<User> lstUser) {
        this.lstUser = lstUser;
    }

}
