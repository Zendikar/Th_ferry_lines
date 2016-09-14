/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETO;

/**
 *
 * @author Tobias
 */
public class RouteNotFoundException extends RuntimeException{

    public RouteNotFoundException(String string) {
        super(string);
    }
    
}
