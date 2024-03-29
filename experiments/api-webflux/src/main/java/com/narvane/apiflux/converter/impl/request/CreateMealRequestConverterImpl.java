package com.narvane.apiflux.converter.impl.request;

import com.narvane.apiflux.converter.RequestConverter;
import com.narvane.apiflux.dto.CreateMealDTO;
import com.narvane.model.Meal;
import org.springframework.stereotype.Component;

@Component
public class CreateMealRequestConverterImpl extends AbstractRequestConverterImpl<Meal, CreateMealDTO.Request> implements RequestConverter<Meal, CreateMealDTO.Request> {

    @Override
    protected Meal toModel(CreateMealDTO.Request request) {
        var meal = new Meal(request.getName());

        /*request.getFoods().forEach(foodRequest -> {
            var food = Optional.ofNullable(foodRequest.getUuid())
                    .map(uuid -> new Food(UUID.fromString(uuid), foodRequest.getName()))
                    .orElse(new Food(foodRequest.getName()));
            food.setProtein(foodRequest.getProtein());
            food.setCarbs(foodRequest.getCarbs());
            food.setFat(foodRequest.getFat());
            meal.addPortion(food);
        });*/
        return meal;
    }

}
