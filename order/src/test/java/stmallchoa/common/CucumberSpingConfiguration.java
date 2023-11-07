package stmallchoa.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import stmallchoa.OrderApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
