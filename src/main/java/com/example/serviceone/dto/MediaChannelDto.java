package com.example.serviceone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MediaChannelDto {
    private Long id;

    private String name;

    private String createdBy;

    private LocalDateTime createdDate;
}
