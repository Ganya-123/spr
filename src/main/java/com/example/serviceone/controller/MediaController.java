package com.example.serviceone.controller;

import com.example.serviceone.dto.MediaChannelDto;
import com.example.serviceone.entity.MediaChannel;
import com.example.serviceone.service.MediaService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MediaController {
    @Autowired
    MediaService mediaService;


    @PostMapping("/channel")
    public MediaChannelDto createChannel(@Valid @RequestBody MediaChannel mediaChannel){
        return mediaService.createChannel(mediaChannel);

    }

    @PutMapping("/channel/{id}")
    public MediaChannelDto updateChannelName(@PathVariable("id") Long channelId,@RequestBody String mediaChannelName) throws Exception {

        return mediaService.updateChannelName(channelId,mediaChannelName);
    }

}
