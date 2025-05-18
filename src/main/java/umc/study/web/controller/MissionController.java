package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.RestuarantConverter;
import umc.study.service.missionService.MissionCommandService;
import umc.study.validation.annotation.ExistRestaurant;
import umc.study.web.request.CreateMissionRequest;
import umc.study.web.response.CreateMissionResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurants")
public class MissionController {

    private final MissionCommandService missionCommandService;

    @PostMapping("/{restaurantId}/missions")
    public ApiResponse<CreateMissionResponse> createMission(
            @PathVariable @ExistRestaurant Long restaurantId,
            @RequestBody @Valid CreateMissionRequest request) {

        CreateMissionResponse response = missionCommandService.createMission(restaurantId, request);
        return ApiResponse.onSuccess(response);
    }
}