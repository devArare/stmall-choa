package stmallchoa.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import stmallchoa.StockApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { StockApplication.class })
public class CucumberSpingConfiguration {}
