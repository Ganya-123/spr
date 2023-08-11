package com.example.serviceone.repo;

import com.example.serviceone.entity.MediaChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaChannelRepo extends JpaRepository<MediaChannel,Long> {
}
