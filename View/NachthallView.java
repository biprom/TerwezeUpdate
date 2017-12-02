package com.biprom.terweze.View;

import com.biprom.terweze.Designs.NachthallDesign;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;

import static com.biprom.terweze.View.NachthallView.VIEW_NAME;

@SpringComponent
@UIScope
@SpringView(name = VIEW_NAME)
public class NachthallView extends NachthallDesign implements View {

    public static final String VIEW_NAME = "Nachthall";
}
