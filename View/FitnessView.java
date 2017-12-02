package com.biprom.terweze.View;

import com.biprom.terweze.Designs.FitnessDesign;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;

import static com.biprom.terweze.View.FitnessView.VIEW_NAME;


@SpringComponent
@UIScope
@SpringView(name = VIEW_NAME)
public class FitnessView extends FitnessDesign implements View {

    public static final String VIEW_NAME = "Fitness";
}
