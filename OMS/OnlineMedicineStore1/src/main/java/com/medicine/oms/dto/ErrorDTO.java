package com.medicine.oms.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ErrorDTO implements UserDTO, MyDTO{
	private String errorMessage;
}
