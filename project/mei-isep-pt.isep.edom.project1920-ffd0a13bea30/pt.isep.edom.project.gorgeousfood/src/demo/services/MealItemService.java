package demo.services;

import java.util.ArrayList;
import java.util.List;

import demo.domain.MealItem;
import demo.persistence.MealItemRepository;

public class MealItemService {
	
	private MealItemRepository mealItemRepository;
	
	public MealItemService() {
		this.mealItemRepository = new MealItemRepository();
	}
		
	/**
	 * Updates a MealItem
	 * @param dto
	 * @return the MealItem DTO
	 */
	public MealItemDTO put(MealItemDTO dto) {
		if (dto.mealItemId==0)
			return null;
		else {
			MealItem mealItem=this.mealItemRepository.save(MealItem.fromDTO(dto));
			return mealItem.toDTO();
		}
	}
	
	/**
	 * Creates a new MealItem
	 * @param dto
	 * @return the MealItemDTO
	 */
	public MealItemDTO post(MealItemDTO dto) {
		if (dto.mealItemId!=0)
			return null;
		else {
			MealItem mealItem=this.mealItemRepository.save(MealItem.fromDTO(dto));
			return mealItem.toDTO();
		}
	}
	
	/**
	 * Deletes an existing MealItem
	 * @param id
	 * @return -1 if error
	 */
	public int delete(int id) {
		return this.mealItemRepository.remove(id);
	}
	
	/**
	 * Returns a MealItemDTO
	 * @param id
	 * @return
	 */
	public MealItemDTO get(int id) {
		MealItem mealItem=this.mealItemRepository.mealItemOfId(id);
		return mealItem.toDTO();
	}
	
	/**
	 * Returns a list with all the MealItems (DTO)
	 * @return
	 */
	public List<MealItemDTO> get() {
		List<MealItem> mealItemList=this.mealItemRepository.allMealItems();
		List<MealItemDTO> dtoList=new ArrayList<MealItemDTO>();
		for (MealItem m: mealItemList) {
			dtoList.add(m.toDTO());
		}
		return dtoList;
	}	
}
