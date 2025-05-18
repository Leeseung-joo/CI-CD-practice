package umc.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import umc.study.service.discordService.DiscordCommandService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/discord")
public class DiscordController {

    private final DiscordCommandService discordCommandService;


    @PostMapping
    public void generateError(@RequestParam String content) {
        discordCommandService.CheckContent(content);
    }
}
