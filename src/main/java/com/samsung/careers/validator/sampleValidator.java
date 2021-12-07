package com.samsung.careers.validator;

import com.samsung.careers.dto.BoardDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class sampleValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return BoardDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        BoardDto t = (BoardDto) target;

        if(StringUtils.isBlank(t.getTitle())){
            errors.rejectValue("title","제목을 입력해주세요.");
        }
    }
}
