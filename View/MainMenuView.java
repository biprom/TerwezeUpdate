package com.biprom.terweze.View;

import com.biprom.terweze.Designs.MainMenuDesing;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

import static com.biprom.terweze.View.MainMenuView.VIEW_NAME;

@SpringComponent
@SpringView(name = VIEW_NAME)
@UIScope

public class MainMenuView extends MainMenuDesing implements View {

    public static final String VIEW_NAME = "MAIN_VIEW";

    private final SpringViewProvider viewProvider;

    @Autowired
    public MainMenuView(SpringViewProvider viewProvider) {
        this.viewProvider = viewProvider;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

        Navigator subNavigator = new Navigator(UI.getCurrent(), subPanel);
        subNavigator.addProvider(viewProvider);

        subNavigator.addView(BadkamerView.VIEW_NAME, viewProvider.getView(BadkamerView.VIEW_NAME));
        subNavigator.addView(BergingView.VIEW_NAME, viewProvider.getView(BergingView.VIEW_NAME));
        subNavigator.addView(BuitenView.VIEW_NAME, viewProvider.getView(BuitenView.VIEW_NAME));
        subNavigator.addView(FitnessView.VIEW_NAME, viewProvider.getView(FitnessView.VIEW_NAME));
        subNavigator.addView(GarageView.VIEW_NAME, viewProvider.getView(GarageView.VIEW_NAME));
        subNavigator.addView(InkomView.VIEW_NAME, viewProvider.getView(InkomView.VIEW_NAME));
        subNavigator.addView(KeukenView.VIEW_NAME, viewProvider.getView(KeukenView.VIEW_NAME));
        subNavigator.addView(LeefruimteView.VIEW_NAME, viewProvider.getView(LeefruimteView.VIEW_NAME));
        subNavigator.addView(NachthallView.VIEW_NAME, viewProvider.getView(NachthallView.VIEW_NAME));
        subNavigator.addView(SlaapkamerView.VIEW_NAME, viewProvider.getView(SlaapkamerView.VIEW_NAME));
        subNavigator.addView(WijnkelderView.VIEW_NAME, viewProvider.getView(WijnkelderView.VIEW_NAME));


        subNavigator.navigateTo(LeefruimteView.VIEW_NAME);

        bBadkamer.addClickListener(e -> subNavigator.navigateTo(BadkamerView.VIEW_NAME));
        bBerging.addClickListener(e -> subNavigator.navigateTo(BergingView.VIEW_NAME));
        bBuiten.addClickListener(e -> subNavigator.navigateTo(BuitenView.VIEW_NAME));
        bFitness.addClickListener(e -> subNavigator.navigateTo(FitnessView.VIEW_NAME));
        bGarage.addClickListener(e -> subNavigator.navigateTo(GarageView.VIEW_NAME));
        bInkom.addClickListener(e -> subNavigator.navigateTo(InkomView.VIEW_NAME));
        bKeuken.addClickListener(e -> subNavigator.navigateTo(KeukenView.VIEW_NAME));
        bLeefruimte.addClickListener(e -> subNavigator.navigateTo(LeefruimteView.VIEW_NAME));
        bNachthall.addClickListener(e -> subNavigator.navigateTo(NachthallView.VIEW_NAME));
        bSlaapkamer.addClickListener(e -> subNavigator.navigateTo(SlaapkamerView.VIEW_NAME));
        bWijnkelder.addClickListener(e -> subNavigator.navigateTo(WijnkelderView.VIEW_NAME));

    }
}
