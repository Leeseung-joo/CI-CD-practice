package umc.study.web.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.service.MemberMissionService;
import umc.study.service.MemberService;
import umc.study.web.dto.MemberMissionResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/members")
public class MemberMissionController {

    private final MemberMissionService memberMissionService;

    @GetMapping("/{member-id}/missions")
    public ResponseEntity<List<MemberMissionResponse>> getMemberMissions(@PathVariable("member-id") Long memberId){
        List<MemberMissionResponse> MemberMissionResponse = memberMissionService.getMemberMissions(memberId);
        return ResponseEntity.ok(MemberMissionResponse);
    }
}
