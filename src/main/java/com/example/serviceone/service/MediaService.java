package com.example.serviceone.service;

import com.example.serviceone.dto.MediaChannelDto;
import com.example.serviceone.entity.MediaChannel;

public interface MediaService {
    public MediaChannelDto createChannel(MediaChannel mediaChannel);

    public MediaChannelDto updateChannelName(Long channelId, String mediaChannelName) throws Exception;
}
