package org.litesgroup.webapp.cucumber.stepdefs;

import org.litesgroup.webapp.LitesWebApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LitesWebApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
