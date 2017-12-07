package com.xinyunlian.retailterminal.shop.handler;

import com.xinyunlian.retailterminal.common.bean.BaseResponse;
import com.xinyunlian.retailterminal.common.exception.ParamValidatorException;
import com.xinyunlian.retailterminal.exception.LSZDException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class 全局异常处理.
 *
 *
 * @version        1.0, 17/11/21
 * @author         yangchenglong
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Method description
     *
     *
     * @param ex
     *
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public BaseResponse errorHandler(Exception ex) {
        return new BaseResponse("服务器异常", false);
    }

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public BaseResponse errorHandler(BindException ex) {
        return new BaseResponse(ex.getMessage(), false);
    }

    @ResponseBody
    @ExceptionHandler(value = ParamValidatorException.class)
    public BaseResponse errorHandler(ParamValidatorException ex) {
        return new BaseResponse("",ex.getMessage(), false);
    }

    @ResponseBody
    @ExceptionHandler(value = LSZDException.class)
    public BaseResponse errorHandler(LSZDException ex) {
        return new BaseResponse(ex.getMessage(), false);
    }
}


