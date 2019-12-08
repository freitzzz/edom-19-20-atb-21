package services;

import java.util.ArrayList;
import java.util.List;

import domain.Meal;
import domain.MealDTO;
import domain.MealImpl;
import persistence.MealRepository;

public class MealService {

	private MealRepository mealRepository;

	public MealService() {
		this.mealRepository = new MealRepository();
	}

	/**
	 * Updates a Meal
	 * 
	 * @param dto
	 * @return the Meal DTO
	 */
	public MealServiceDTO put(MealServiceDTO dto) {
		if (dto.mealId == 0)
			return null;
		else {

			MealDTO mealDTO = new MealDTO();

			mealDTO.id = dto.mealId;

			mealDTO.name = dto.name;

			Meal meal = this.mealRepository.save(MealImpl.fromDTO(mealDTO));

			MealServiceDTO serviceDTO = new MealServiceDTO();

			serviceDTO.mealId = meal.id();

			serviceDTO.name = meal.name();

			return serviceDTO;
		}
	}

	/**
	 * Creates a new Meal
	 * 
	 * @param dto
	 * @return the MealDTO
	 */
	public MealServiceDTO post(MealServiceDTO dto) {
		if (dto.mealId != 0)
			return null;
		else {
			MealDTO mealDTO = new MealDTO();

			mealDTO.id = dto.mealId;

			mealDTO.name = dto.name;

			Meal meal = this.mealRepository.save(MealImpl.fromDTO(mealDTO));

			MealServiceDTO serviceDTO = new MealServiceDTO();

			serviceDTO.mealId = meal.id();

			serviceDTO.name = meal.name();

			return serviceDTO;
		}
	}

	/**
	 * Deletes an existing Meal
	 * 
	 * @param id
	 * @return -1 if error
	 */
	public int delete(int id) {
		return this.mealRepository.remove(id);
	}

	/**
	 * Returns a MealDTO
	 * 
	 * @param id
	 * @return
	 */
	public MealServiceDTO get(int id) {
		Meal meal = this.mealRepository.MealOfId(id);
		
		MealServiceDTO serviceDTO = new MealServiceDTO();
		
		serviceDTO.mealId = meal.id();
		
		serviceDTO.name = meal.name();
		
		return serviceDTO;
	}

	/**
	 * Returns a list with all the Meals (DTO)
	 * 
	 * @return
	 */
	public List<MealServiceDTO> get() {
		List<Meal> mealList = this.mealRepository.all();
		List<MealServiceDTO> dtoList = new ArrayList<MealServiceDTO>();
		for (Meal m : mealList) {
			
			MealServiceDTO serviceDTO = new MealServiceDTO();
			
			serviceDTO.mealId = m.id();
			
			serviceDTO.name = m.name();
			
			dtoList.add(serviceDTO);
		}
		return dtoList;
	}
}
