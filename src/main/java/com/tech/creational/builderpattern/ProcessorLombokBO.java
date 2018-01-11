package com.tech.creational.builderpattern;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
@Data
public class ProcessorLombokBO {

    @NonNull private String panel;
    @NonNull private String motherBoard;
    @NonNull private String ram;
    @NonNull private String hardDisk;
}
