/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Message;
import java.io.IOException;

/**
 *
 * @author admin
 */
public interface inReceiveMessage {

    public void ReceiveMessage(Message msg) throws IOException;
}
