package testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bases.Base;

public class FormularioContacto extends Base {
	@BeforeTest
	public void openBrowser() {
		navegador.get("https://winstoncastillo.com/robot-selenium/index.php?route=information/contact");
	}
	
	@AfterTest
	public void cerrarNavegador() {
		navegador.close();
	}
	
	@Test
	public void aplicarDataForm() throws Exception {
		//System.out.println(navegador.getTitle());
		ArrayList<String> datos = datosLeidos.getData();
		
		int number = datos.size();
		
		System.out.println(number);
		
		for (int i=1; i<number; i++) {
			String[] lineaDatos = datos.get(i).split(";");
			repositorioContacto.fieldNameElement().sendKeys(lineaDatos[1]);
			repositorioContacto.fieldEmailElement().sendKeys(lineaDatos[2]);
			repositorioContacto.fieldDescriptionElement().sendKeys(lineaDatos[3]);
			repositorioContacto.submitButtonElement().click();
			WebElement botonContinuar = espera.until(ExpectedConditions.visibilityOf(repositorioContacto.continueButtonElement()));
			System.out.println("Repeticion nro: " + i);
			navegador.get("https://winstoncastillo.com/robot-selenium/index.php?route=information/contact");
		}
	}

}
