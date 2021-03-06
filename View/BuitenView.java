package com.biprom.terweze.View;

import com.biprom.terweze.Designs.BuitenDesign;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;

import static com.biprom.terweze.View.BuitenView.VIEW_NAME;


@SpringComponent
@UIScope
@SpringView(name = VIEW_NAME)
public class BuitenView extends BuitenDesign implements View {

    public static final String VIEW_NAME = "Buiten";
}
