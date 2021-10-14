package com.star.wars.domain.dto;

import java.util.List;


import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class ResultDTO <T>{

    private int count;
	private String next;
	private String previous;
	private List<T> results;
    
}
