/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.KeyCode;
import org.junit.Before;
import org.junit.Test;
import static org.loadui.testfx.Assertions.verifyThat;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.controls.Commons.hasText;

/**
 *
 * @author carlos
 */
public class CT01 extends GuiTest {

    @Override
    protected Parent getRootNode() {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parent;
    }
    
    @Before
    public void login() {
        click("#txtUsername").type("1");
        click("#txtPassword").type("1");
        
        click("#staffLoginButton");        
    }
    
    @Test
    public void test() {
        click("#newOrderTable1");  
        click("#newOrderTable1");
        
        verifyThat("#historyOrder_Label", hasText("Latest Order of Table"));
    }
}