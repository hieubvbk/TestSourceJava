/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection;

/**
 *
 * @author AsRock
 */
public class UserController {
    private MessageService messageService;
    
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }
    
    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}
