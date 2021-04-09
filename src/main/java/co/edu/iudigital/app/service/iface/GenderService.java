package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Gender;

public interface GenderService {
	//Lista todos los géneros de películas
	public List<Gender> getAll();
}
