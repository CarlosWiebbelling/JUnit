/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.junit.Before;
import org.junit.Test;
import static org.loadui.testfx.Assertions.verifyThat;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.controls.Commons.hasText;

/**
 *
 * @author carlos
 */
public class CT11 extends GuiTest {

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
        click("#AdmiUsername").type("1");
        click("#AdmiPassword").type("1");
        
        click("#admiLoginButton");
    }
    
    @Test
    public void test() {
        click("#staffListAdminID");
        
        click("#staffTable");
        click("#staffFirst").type("Elvis");
        click("#staffLast").type("Presley");
        click("#staffUsername").type("elvisP");
        click("#staffPassword").type("12345");
        
        click("#addStaffID");
        
        verifyThat("#status", hasText("New user inserted successfully"));
    }
}