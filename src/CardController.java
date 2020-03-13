/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
@Named(value = "cardController")
@SessionScoped
public class CardController implements Serializable {

    private ArrayList<Integer> deck = new ArrayList<Integer>();

    public CardController() {
        for (int i = 0; i < 52; i++)
            deck.add(i);
        Collections.shuffle(deck);
    }

    public String getImageName1() {
        return (deck.get(0) + 1) + ".png";
    }

    public String getImageName2() {
        return (deck.get(1) + 1) + ".png";
    }

    public String getImageName3() {
        return (deck.get(2) + 1) + ".png";
    }

    public String getImageName4() {
        return (deck.get(3) + 1) + ".png";
    }

    public void refresh() {
        Collections.shuffle(deck);
    }

}