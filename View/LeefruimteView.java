package com.biprom.terweze.View;

import com.biprom.terweze.Designs.LeefruimteDesign;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;

import static com.biprom.terweze.View.LeefruimteView.VIEW_NAME;

@SpringComponent
@UIScope
@SpringView(name = VIEW_NAME)
public class LeefruimteView extends LeefruimteDesign implements View {

    public static final String VIEW_NAME = "Leefruimte";
}
