package com.example.serviceone.service;

import com.example.serviceone.dto.MediaChannelDto;
import com.example.serviceone.entity.MediaChannel;
import com.example.serviceone.repo.MediaChannelRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
@Service
public class MediaServiceImpl implements MediaService{

    @Autowired
    MediaChannelRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public MediaChannelDto createChannel(MediaChannel mediaChannel) {
        MediaChannel details=repo.save(mediaChannel);
        return mapper.map(details,MediaChannelDto.class);
    }

    @Override
    public MediaChannelDto updateChannelName(Long channelId, String mediaChannelName) throws Exception {
        Optional<MediaChannel> channel= repo.findById(channelId);
        if(!channel.isPresent()){
            throw new Exception("channel with Id does not exist");
        }
        else {
            MediaChannel mediaChannel = repo.findById(channelId).get();

            if (!"".equalsIgnoreCase(mediaChannelName)) {
                mediaChannel.setName(mediaChannelName);
            }

            repo.save(mediaChannel);
            return mapper.map(mediaChannel, MediaChannelDto.class);
        }
    }
}
