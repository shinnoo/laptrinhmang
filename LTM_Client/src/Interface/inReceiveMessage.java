/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.KMessage;
import java.io.IOException;

/**
 *
 * @author admin
 */
public interface inReceiveMessage {

    public void ReceiveMessage(KMessage msg) throws IOException;
}
