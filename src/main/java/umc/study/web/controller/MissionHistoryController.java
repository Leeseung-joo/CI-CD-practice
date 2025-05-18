package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umc.study.service.missionService.MissionHistoryCommandServiceImpl;
import umc.study.web.request.CreateMissionHistoryRequest;
import umc.study.web.response.CreateMissionHistoryResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/missions/history")
public class MissionHistoryController {

    private final MissionHistoryCommandServiceImpl missionHistoryCommandService;

    @PostMapping
    public ResponseEntity<CreateMissionHistoryResponse> createMissionHistory(
            @RequestBody @Valid CreateMissionHistoryRequest request) {
        return ResponseEntity.ok(missionHistoryCommandService.createMissionHistory(request));
    }
}
