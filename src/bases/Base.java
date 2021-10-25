package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import reader.CVSFileReader;
import repository.ContactFormRepository;

public class Base {
	protected CVSFileReader datosLeidos = new CVSFileReader();
	protected WebDriver navegador = new ChromeDriver();
	protected WebDriverWait espera = new WebDriverWait(navegador, 20);
	protected ContactFormRepository repositorioContacto = new ContactFormRepository(navegador);

}
