package co.edu.iudigital.app.service.iface;
//Importación de la librería
import java.util.List;

import co.edu.iudigital.app.model.entity.Gender;

public interface GenderService {
	//Lista todos los géneros de películas
	public List<Gender> getAll();
}
