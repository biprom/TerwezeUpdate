package com.biprom.terweze.client;

import com.biprom.terweze.ButtonMouseUpDown;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.MouseEventDetailsBuilder;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.ui.Connect;


@Connect(com.biprom.terweze.ButtonMouseUpDown.class)
public class ButtonMouseUpDownConnector extends AbstractComponentConnector {
    private final ButtonMouseUpDownServerRpc serverRpc = RpcProxy.create(ButtonMouseUpDownServerRpc.class, this);

    public ButtonMouseUpDownConnector() {
        registerRpc(ButtonMouseUpDownClientRpc.class, new ButtonMouseUpDownClientRpc() {
            public void alert() {
                // TODO Do something useful
                Window.alert("");
            }
        });

        getWidget().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());
                serverRpc.clicked(mouseDetails);
            }
        });



        getWidget().addMouseDownHandler(new MouseDownHandler() {

            @Override
            public void onMouseDown(MouseDownEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());


                serverRpc.mouseDown(getWidget().getStylePrimaryName()+"DOWN");
            }
        });

        getWidget().addMouseUpHandler(new MouseUpHandler() {

            @Override
            public void onMouseUp(MouseUpEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());
                serverRpc.mouseUp(getWidget().getStylePrimaryName()+"UP");
            }
        });
    }

    @Override
    protected Widget createWidget() {
        return GWT.create(ButtonMouseUpDownWidget.class);
    }

    @Override
    public ButtonMouseUpDownWidget getWidget() {
        return (ButtonMouseUpDownWidget) super.getWidget();
    }

    @Override
    public ButtonMouseUpDownState getState() {
        return (ButtonMouseUpDownState) super.getState();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);

        // TODO do something useful
        final String text = getState().text;
        getWidget().setText(text);
    }
}
