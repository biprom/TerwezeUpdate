package com.biprom.terweze;


import com.biprom.terweze.Data.Data;
import com.biprom.terweze.client.ButtonMouseUpDownServerRpc;
import com.biprom.terweze.client.ButtonMouseUpDownState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ButtonMouseUpDown extends AbstractComponent {

    @Autowired
    Data sharedData;


    public ButtonMouseUpDown() {
        registerRpc(rpc);
        getState().text = "AAN/UIT DIM";


    }



    private ButtonMouseUpDownServerRpc rpc = new ButtonMouseUpDownServerRpc() {
        @Override
        public void clicked(MouseEventDetails mouseDetails) {

        }

        @Override
        public void mouseDown(String msg) {
    /*
            switch (msg){
            case "bureau1DOWN":  sd.setBoolVBureau1(true);
            break;

            }
            */

            //System.out.println("mousedetails = " + );

        }

        @Override
        public void mouseUp(String msg) {
            /*
            switch (msg){
                case "bureau1DOWN":  sd.setBoolVBureau1(false);
                    break;

            }
            */

            //System.out.println("mousedetails = " + sharedData.isBoolVBureau1());

        }
    };



    public void setButtonName(String msg){
        getState().text = msg;
    }

    @Override
    public ButtonMouseUpDownState getState() {
        return (ButtonMouseUpDownState) super.getState();
    }



}




