package com.biprom.terweze.View;

import com.biprom.terweze.Designs.WijnkelderDesign;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;

import static com.biprom.terweze.View.WijnkelderView.VIEW_NAME;


@SpringComponent
@UIScope
@SpringView(name = VIEW_NAME)
public class WijnkelderView extends WijnkelderDesign implements View {

    public static final String VIEW_NAME = "Wijnkelder";
}
