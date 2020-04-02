/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
@Named
@SessionScoped
public class CardController implements Serializable {

    private ArrayList<Integer> deck = new ArrayList<Integer>();


    private String imageName1,imageName2,imageName3,imageName4;

    public String getImageName1() {
        return deck.get(0) + ".png";
    }

    public void setImageName1(String imageName1) {
        this.imageName1 = imageName1;
    }

    public String getImageName2() {
        return deck.get(1)  + ".png";
    }

    public void setImageName2(String imageName2) {
        this.imageName2 = imageName2;
    }

    public String getImageName3() {
        return deck.get(2)  + ".png";
    }

    public void setImageName3(String imageName3) {
        this.imageName3 = imageName3;
    }

    public String getImageName4() {
        return deck.get(3)  + ".png";
    }

    public void setImageName4(String imageName4) {
        this.imageName4 = imageName4;
    }

    public CardController() {
        for (int i = 1; i < 53; i++)
            deck.add(i);

        Collections.shuffle(deck);

    }


    public void refresh() {

        Collections.shuffle(deck);
    }

}